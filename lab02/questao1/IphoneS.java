package lab02.questao1;

public class IphoneS implements Celular{
    @Override
    public void tiraFoto(){
        System.out.println("IphoneS tirando foto!");
    }

    @Override
    public void fazLigacao(){
        System.out.println("IphoneS faz ligação!");
    }
    
}
