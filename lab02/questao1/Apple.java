package lab02.questao1;

public class Apple implements FabricanteCelular{
    // instance é um nome de variável, static= pertence a classe
    private static Apple instance;
    
    // cria um construtor privado, ngm vai conseguir fazer new Apple()
    private Apple(){}
    
    // se não existe uma Apple, cria uma, devolve a que ja existe
    public static Apple getInstance(){
        if(instance == null){
            instance = new Apple();
        }            
        return instance;
    }

    // metodo Factory: decide qual celula cria com base no texto do modelo
    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("IphoneX")){
            return new IphoneX();
        } else if (modelo.equals("IphoneS")){
            return new IphoneS();
        }
        return null;
    }
}
