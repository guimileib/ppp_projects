package lab04.questao3;

public class Main{
    public static void main(String[] args) {

        MaquinaPipoca mp = new MaquinaPipoca();
        Luzes l = new Luzes();
        PlayerStreaming ps = new PlayerStreaming();
        Amplificador amp = new Amplificador();
        Projetor pj = new Projetor();
        Telao tl = new Telao();

        HomeTheaterFacade home = new HomeTheaterFacade(mp, l, ps, amp, pj, tl);
        home.verFilme("Harry Potter 7", 20);

        home.fimDoFilme();
    }
}