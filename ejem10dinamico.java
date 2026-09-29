import java.util.ArrayList;
import java.util.List;

public class ejem10dinamico {
    
    public static void main(String[] args) {
        List<ejem10Dato> lista = new ArrayList<>(); 
        lista.add(new ejem10Dato("Juan", 25, "juan@tesoem.com"));
        lista.add(new ejem10Dato("Maria", 30, "maria@tesoem.com"));
        lista.add(new ejem10Dato("Pedro", 35, "pedro@tesoem.com"));
        lista.add(new ejem10Dato("Ana", 28, "ana@tesoem.com"));

        for (ejem10Dato dato : lista) {
            System.out.println("Nombre: " + dato.getNombre());
            System.out.println("Edad: " + dato.getEdad());
            System.out.println("Correo: " + dato.getCorreo());
            System.out.println("------------------------");
        }

    }
}