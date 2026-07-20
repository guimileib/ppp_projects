package lab06.questao1;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.adicionarCondimentos();
        cafe.prepararBebida();
        
        Cha cha = new Cha();
        cha.prepararReceita();
        cha.adicionarCondimentos();
    }
}
