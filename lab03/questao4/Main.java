public class Main {

    public static void main(String[] args) {

        System.out.println("== Usuario comum tentando ler ==");
        Documento docComum = new DocumentoProxy("contrato.pdf", "USUARIO");
        System.out.println(docComum.ler());

        System.out.println();
        System.out.println("== Administrador lendo ==");
        Documento docAdmin = new DocumentoProxy("contrato.pdf", "ADMIN");
        System.out.println(docAdmin.ler());
        System.out.println(docAdmin.ler());
    }
}
