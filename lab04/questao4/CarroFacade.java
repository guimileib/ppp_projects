package lab04.questao4;

public class CarroFacade {
    private Motor motor;
    private CintoSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;


    public CarroFacade(Motor motor, CintoSeguranca cinto, Porta porta, Farol farol, Radio radio){
        this.motor = motor;
        this.cinto = cinto;
        this.porta = porta;
        this.farol = farol;
        this.radio = radio;
    }

    public void dirigirCarro(double frequencia){
        System.out.println("Dirigindo Carro");
        motor.ligarCarro();
        cinto.travarCinto();
        porta.fecharPorta();
        farol.ligarFarol();
        radio.ligarRadio();
        radio.sintonizar(frequencia);
    }

    public void finalizarCorrida(){
        System.out.println("Finalizando Corrida");
        motor.desligarCarro();
        cinto.tirarCinto();
        porta.abrirPorta();
        farol.desligarFarol();
        radio.desligarRadio();
    }
}
