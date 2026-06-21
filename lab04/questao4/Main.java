package questao4;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor();
        CintoSeguranca cinto = new CintoSeguranca();
        Porta porta = new Porta();
        Farol farol = new Farol();
        Radio radio = new Radio();

        CarroFacade carro = new CarroFacade(motor, cinto, porta, farol, radio);

        carro.dirigir("89.1 FM");
        System.out.println();
        carro.finalizar();
    }
}
