package lab04.questao3;

public class MaquinaPipoca {
    private boolean pipoqueira;

    public void ligarPipoqueira(){
        System.out.println("Ligando pipoqueira");
        setPipoqueira(true);
    }

    public void desligarPipoqueira(){
        System.out.println("Desligando pipoqueira");
        setPipoqueira(false);
    }

    public void arrebentarPipoca(){
        pipoqueira = getPipoqueira();
        if (pipoqueira == true){
            System.out.println("Arrebentando Pipoca");
        } else{
            System.out.println("Ligue a pipoqueira primeiro.");
        }
        
    }

    public boolean getPipoqueira() {
        return pipoqueira;
    }

    public void setPipoqueira(boolean pipoqueira) {
        this.pipoqueira = pipoqueira;   
    }
}
