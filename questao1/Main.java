public class Main {

    public static void main(String[] args) {

        FabricanteCelular apple = Apple.getInstance();
        FabricanteCelular samsung = Samsung.getInstance();

        Celular iphoneX = apple.constroiCelular("iphoneX");
        Celular iphoneS = apple.constroiCelular("iphoneS");
        Celular galaxy8 = samsung.constroiCelular("galaxy8");
        Celular galaxy20 = samsung.constroiCelular("galaxy20");

        System.out.println("== Testando os iPhones (Apple) ==");
        iphoneX.fazLigacao();
        iphoneX.tiraFoto();
        iphoneS.fazLigacao();
        iphoneS.tiraFoto();

        System.out.println();
        System.out.println("== Testando os Galaxy (Samsung) ==");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();
        galaxy20.fazLigacao();
        galaxy20.tiraFoto();

        System.out.println();
        System.out.println("Apple.getInstance() == Apple.getInstance() ? "
                + (Apple.getInstance() == apple));
    }
}
