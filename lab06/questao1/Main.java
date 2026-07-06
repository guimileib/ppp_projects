package questao1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Preparando Café ===");
        new Cafe().prepararReceita();

        System.out.println("\n=== Preparando Capuccino ===");
        new Capuccino().prepararReceita();

        System.out.println("\n=== Preparando Chá ===");
        new Cha().prepararReceita();
    }
}
