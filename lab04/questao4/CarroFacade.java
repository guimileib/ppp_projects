package questao4;

public class CarroFacade {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFacade(Motor motor, CintoSeguranca cinto, Porta porta, Farol farol, Radio radio) {
        this.motor = motor;
        this.cinto = cinto;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void dirigir(String estacao) {
        System.out.println("Iniciando a corrida...");
        motor.liga();
        porta.tranca();
        cinto.trava();
        farol.acende();
        radio.liga();
        radio.sintoniza(estacao);
    }

    public void finalizar() {
        System.out.println("Finalizando a corrida...");
        motor.desliga();
        porta.destranca();
        cinto.destrava();
        farol.apaga();
        radio.desliga();
    }
}
