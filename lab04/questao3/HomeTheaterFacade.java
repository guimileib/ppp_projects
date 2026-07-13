package lab04.questao3;

class HomeTheaterFacade {
    private MaquinaPipoca mp;
    private Luzes l;
    private Amplificador amp;
    private PlayerStreaming ps;
    private Projetor pj;
    private Telao tl;

    public HomeTheaterFacade(MaquinaPipoca mp, Luzes l, PlayerStreaming ps, Amplificador amp, Projetor pj, Telao tl){
        this.mp = mp;
        this.l = l;
        this.ps = ps;
        this.amp = amp;
        this.pj = pj;
        this.tl = tl;
    }

    public void verFilme(String filme, double volume){
        l.ligarLuzes();
        mp.ligarPipoqueira();
        mp.arrebentarPipoca();
        amp.ligarTomada();
        amp.ajustarVolume(volume);
        ps.ligarPlayer();
        ps.playFilme(filme);
        pj.ligarBotao();
        tl.descerTelao();
    }


    public void fimDoFilme(){
        l.apagarLuzes();
        mp.desligarPipoqueira();
        amp.setTomada(false);
        ps.desligarPlayer();
        pj.desligarBotao();
        tl.subirTelao();
    }


}
