import java.util.Scanner;
/**
 * @author Carmen Montiel Villegas.
 */
public class Calculadora {
    private double valorAcumulado;

    /**
     * Permite mostrar lo que está almacenado en la variable valorAcumulado.
     * @return devuelve el valor de la variable valorAcumulado.
     */
    public double getAcumulador() {
        return valorAcumulado;
    }
    public void setAcumulador(double acumulador) {
        this.valorAcumulado = acumulador;
    }

    /**
     * Muestra un menú con el que el usuario podrá seleccionar la operación
     * que desee realizar.
     */
    public void menCalculadora(){
        System.out.println("¿Qué operación desea realizar?");
        System.out.println(" [-] [+]");
        System.out.println(" [*] [/]");
        System.out.println(" [c] [o]");
    }

    /**
     * Operación suma.
     * @param numero recibe el argumento.
     * @return devuelve el valor.
     */
    public double suma(double numero){
        valorAcumulado += numero;
        return valorAcumulado;
    }

    /**
     * Operación resta.
     * @param numero recibe el argumento.
     * @return devuelve el valor.
     */
    public double resta(double numero){
        valorAcumulado -= numero;
        return valorAcumulado;
    }

    /**
     * Operación multiplicación.
     * @param numero recibe el argumento.
     * @return devuelve el valor.
     */
    public double multiplicacion(double numero){
        valorAcumulado *= numero;
        return valorAcumulado;
    }

    /**
     * Operación división.
     * @param numero recibe el argumento.
     * @return devuelve el valor.
     */
    public double division(double numero){
        valorAcumulado /= numero;
        return valorAcumulado;
    }

    /**
     * peración módulo.
     * @param numero recibe el argumento.
     * @return devuelve el valor.
     */
    public double modulo(double numero){
        valorAcumulado %= numero;
        return valorAcumulado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num = 0;
        String opcionCalculadora;
        int centinela = 1;

        //objeto calculadora.

        Calculadora calculadora = new Calculadora();
        System.out.print("Escriba un número: ");
        num = teclado.nextDouble();
        calculadora.setAcumulador(num);
        /*
    Menú principal: Se ingresa un número, luego el respectivo simbolo matemático de la operación que se quiere realizar y así se verá el menú de opciones de las operaciones.
    resta [-], suma [+], división[/], multiplicación [*].
    [c] para reiniciar o limpiar e iniciar una nueva operación. Si selecciona esta opción y
    anteriormente había un valor de resultado este pasará a ser 0 nuevamente.
    [o] finaliza el programa.
     */
        calculadora.menCalculadora();
        opcionCalculadora = teclado.next();

        while (centinela == 1){
            //Validación de la opción seleccionada.

            if (opcionCalculadora.equals("+")){
                System.out.print("Escriba un número: ");
                num = teclado.nextDouble();
                calculadora.suma(num);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menCalculadora();
                opcionCalculadora = teclado.next();

                //Valida que la opción seleccionada sea una suma.

            } else if (opcionCalculadora.equals("-")) {
                System.out.print("Escriba un número: ");
                num = teclado.nextDouble();
                calculadora.resta(num);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menCalculadora();
                opcionCalculadora = teclado.next();

                //Valida que la opción seleccionada sea una resta.

            } else if (opcionCalculadora.equals("*")) {
                System.out.print("Escriba un número: ");
                num = teclado.nextDouble();
                calculadora.multiplicacion(num);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                calculadora.menCalculadora();
                opcionCalculadora = teclado.next();

                //Valida que la opción seleccionada sea una multiplicación.

            } else if (opcionCalculadora.equals("/")) {
                System.out.print("Escriba un número: ");
                num = teclado.nextDouble();
                if (num == 0){
                    System.out.println("Systax Error");
                }else {
                    calculadora.division(num);
                    System.out.printf("%.2f %n", calculadora.getAcumulador());

                    calculadora.menCalculadora();
                    opcionCalculadora = teclado.next();
                    
                    //Valida que la opción seleccionada sea una división.
                }
            } else if (opcionCalculadora.equals("c")) {
                calculadora.setAcumulador(0);
                System.out.printf("%.2f %n", calculadora.getAcumulador());

                System.out.print("Escriba un número: ");
                num = teclado.nextDouble();
                calculadora.suma(num);

                calculadora.menCalculadora();
                opcionCalculadora = teclado.next();

                //Valida la opción de limpiar resultado.

            } else if (opcionCalculadora.equals("o")) {
                System.out.println("Fin de las operaciones");
                centinela = 0;
            }
        }
    }
}
