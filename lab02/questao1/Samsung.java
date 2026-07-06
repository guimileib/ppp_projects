package lab02.questao1;

public class Samsung implements FabricanteCelular{
    private static Samsung instance;

    private Samsung(){}

    public static Samsung getInstance(){
        if(instance == null){
            instance = new Samsung();
        }
        return instance;
    }

    @Override
    public Celular constroiCelular(String modelo){
        if(modelo.equals("Galaxy8")){
            return new Galaxy8();
        } else if (modelo.equals("Galaxy20")){
            return new Galaxy20();
        } 
        return null;
    }
}