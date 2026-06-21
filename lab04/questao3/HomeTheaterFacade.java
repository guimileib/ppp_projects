package questao3;

public class HomeTheaterFacade {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaPipoca pipoca;
    private Projetor projetor;
    private PlayerStreaming player;
    private Telao telao;

    public HomeTheaterFacade(Amplificador amplificador, Luzes luzes, MaquinaPipoca pipoca,
                             Projetor projetor, PlayerStreaming player, Telao telao) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.pipoca = pipoca;
        this.projetor = projetor;
        this.player = player;
        this.telao = telao;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir o filme...");
        pipoca.liga();
        pipoca.arrebentaPipoca();
        luzes.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.ajustaVolume(10);
        player.liga();
        player.play(filme);
    }

    public void fimDoFilme() {
        System.out.println("Encerrando a sessao de cinema...");
        pipoca.desliga();
        player.desliga();
        amplificador.desliga();
        projetor.desliga();
        telao.sobe();
        luzes.liga();
    }
}
