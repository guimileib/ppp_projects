public class Apple implements FabricanteCelular {

    private static Apple instancia;

    private Apple() {
    }

    public static Apple getInstance() {
        if (instancia == null) {
            instancia = new Apple();
        }
        return instancia;
    }

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
