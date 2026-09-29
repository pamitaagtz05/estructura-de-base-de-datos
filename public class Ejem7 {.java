
public class Ejem7 {
    private int contador=0;
    public static int contadorEstatico=0;

    public Ejem7() {
        contador=1;
    }

    public void incrementarContador() {
        contador++;
    }

    public int getContador() {
        return contador;
    }

    public static void incrementarContadorEstatico() {
        contadorEstatico++;
    }

    public static int getContadorEstatico() {
        return contadorEstatico;
    }

    public static void main(String[] args) {
        Ejem7 obj1 = new Ejem7();
        Ejem7 obj2 = new Ejem7();

        System.out.println("Contador del objeto 1: " + obj1.getContador());
        System.out.println("Contador del objeto 2: " + obj2.getContador());
        Ejem7.incrementarContadorEstatico();
        obj1.incrementarContador();
        obj2.incrementarContador();

        System.out.println("Contador del objeto 1 después de incrementar: " + obj1.getContador());
        System.out.println("Contador del objeto 2 después de incrementar: " + obj2.getContador());
        System.out.println("Contador estático después de incrementar: " + Ejem7.getContadorEstatico());
    }
}

