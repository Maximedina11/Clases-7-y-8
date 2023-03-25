import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            String nombre = nombrePersona(leer);
            int edad = edadPersona(leer);
            mostrarDatos(nombre, edad);
            if (esMayorDeEdad(edad)) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            
            System.out.print("¿Quiere seguir ingresando personas? (Sí/No): ");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                seguir = false;
            }
        }
        
    }
    
    public static String nombrePersona(Scanner leer) {
        System.out.print("Ingrese el nombre de la persona: ");
        return leer.nextLine();
    }
    
    public static int edadPersona(Scanner leer) {
        System.out.print("Ingrese la edad de la persona: ");
        return Integer.parseInt(leer.nextLine());
    }
    
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }
}

