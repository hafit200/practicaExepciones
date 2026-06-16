package excepciones;

public class Main {

    public static void main(String[] args) {

        try {

            int num1 = 10;
            int num2 = 0;

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: No se puede dividir para cero.");

        }

        System.out.println("Programa finalizado.");

    }
}
