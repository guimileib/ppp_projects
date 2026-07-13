package lab04.questao3;

public class Projetor {
    private boolean botao;
    
    public void ligarBotao(){
        System.out.println("Ligando Projetor");
        setBotao(true);
    }

    public void desligarBotao(){
        System.out.println("Desligando Projetor");
        setBotao(false);
    }

    public boolean getBotao() {
        return botao;
    }

    public void setBotao(boolean botao) {
        this.botao = botao;
    }

}
