import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros a convertir: ");
        double euros = leer.nextDouble();
        System.out.print("Introduce la moneda a la que se va a convertir (libras/dólares/yenes): ");
        String divisa = leer.next();
        convertirMoneda(euros, divisa);
    }
    
    public static void convertirMoneda(double euros, String divisa) {
        double resultado = 0;
        switch (divisa.toLowerCase()) {
            case "libras":
                resultado = euros * 0.86;
                System.out.println(euros + " euros son " + resultado + " libras.");
                break;
            case "dolares":
                resultado = euros * 1.28611;
                System.out.println(euros + " euros son " + resultado + " dolares.");
                break;
            case "yenes":
                resultado = euros * 129.852;
                System.out.println(euros + " euros son " + resultado + " yenes.");
                break;
            default:
                System.out.println("Moneda inexistente.");
        }
    }
}

