import java.util.Scanner;

public class Ejercicio4 {

    public static boolean result(int num) {
        if (num <= 1) {
            return false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = leer.nextInt();
        if (result(num)) {
            System.out.println(num + " es un número primo");
        } else {
            System.out.println(num + " no es un número primo");
        }
    }
}
