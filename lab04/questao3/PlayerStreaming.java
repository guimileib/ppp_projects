package lab04.questao3;

public class PlayerStreaming {
    private boolean botao;

    public void ligarPlayer(){
        System.out.println("Ligando Player");
        setBotao(true);
    }

    public void desligarPlayer(){
        System.out.println("Desligando Player");
        setBotao(false);
    }

    public void playFilme(String filme){
        if (getBotao() == false){
            System.out.println("Ligue primeiro o Player");
        }else{
            System.out.println("Abrindo: " + filme);
        }
    }

    public boolean getBotao() {
        return botao;
    }
    public void setBotao(boolean botao) {
        this.botao = botao;
    }
    
}
