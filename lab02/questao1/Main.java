package lab02.questao1;

public class Main {
    public static void main(String[] args) {
        
        //sigleton pega os fabricantes
        FabricanteCelular apple = Apple.getInstance();
        FabricanteCelular samsung =Samsung.getInstance();

        //factory- cada fabricante constroi os modelos
        Celular iphoneX = apple.constroiCelular("IphoneX");
        Celular galaxy8 = samsung.constroiCelular("Galaxy8");

        iphoneX.fazLigacao();
        iphoneX.tiraFoto();

        galaxy8.fazLigacao();
        galaxy8.tiraFoto();


    }
}
