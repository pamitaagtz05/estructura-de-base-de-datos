import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<ejem10Dato> lista = new ArrayList<>();

        // Preguntar cuántos datos se quieren capturar
        System.out.print("¿Cuántos datos quieres capturar?: ");
        int cantidad = teclado.nextInt();
        teclado.nextLine();

        // Capturar los datos
        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nDato #" + (i + 1));

            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();

            System.out.print("Edad: ");
            int edad = teclado.nextInt();
            teclado.nextLine();

            System.out.print("Correo: ");
            String correo = teclado.nextLine();

            lista.add(new ejem10Dato(nombre, edad, correo));
        }

        // Mostrar los datos capturados
        System.out.println("\n========== DATOS CAPTURADOS ==========");

        for (ejem10Dato dato : lista) {

            System.out.println("Nombre: " + dato.getNombre());
            System.out.println("Edad: " + dato.getEdad());
            System.out.println("Correo: " + dato.getCorreo());
            System.out.println("------------------------");
        }

        teclado.close();
    }
}