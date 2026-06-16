package excepciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");
            int a = sc.nextInt();

            System.out.print("Ingrese otro número: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("No se puede dividir para cero.");

        } catch (Exception e) {

            System.out.println("Debe ingresar números válidos.");

        }

    }
}
