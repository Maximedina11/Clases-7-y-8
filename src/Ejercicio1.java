import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        System.out.println("Seleccione la operación que desea realizar:\n 1 - Sumar\n 2 - Restar \n 3 - Multiplicar \n 4 - Dividir");
       
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(num1, num2));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int restar(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
