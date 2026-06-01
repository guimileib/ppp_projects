// Padrao SINGLETON:
// so faz sentido existir uma instancia da fabricante Apple no sistema.
// O construtor e privado e o acesso e feito sempre por getInstance().
public class Apple implements FabricanteCelular {

    private static Apple instancia;

    private Apple() {
        // construtor privado evita que alguem faca "new Apple()" por fora
    }

    public static Apple getInstance() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

    // Aqui esta o padrao FABRICA: a partir do nome do modelo decidimos
    // qual celular concreto sera criado.
    @Override
    public Celular constroiCelular(String modelo) {
        switch (modelo.toLowerCase()) {
            case "iphonex":
                return new IPhoneX();
            case "iphones":
                return new IPhoneS();
            default:
                throw new IllegalArgumentException("Apple nao fabrica o modelo: " + modelo);
        }
    }
}
