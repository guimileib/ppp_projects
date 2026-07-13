package lab04.questao4;

public class Main {
    public static void main(String[] args) {

        CintoSeguranca cinto = new CintoSeguranca();
        Motor motor = new Motor();
        Porta porta = new Porta();
        Radio radio = new Radio();
        Farol farol = new Farol();

        CarroFacade carro = new CarroFacade(motor, cinto, porta, farol, radio);
        carro.dirigirCarro(403);
        System.out.println("");
        carro.finalizarCorrida();
    }
}
