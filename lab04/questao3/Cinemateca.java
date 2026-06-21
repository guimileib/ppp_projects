package questao3;

public class Cinemateca {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaPipoca pipoca = new MaquinaPipoca();
        Projetor projetor = new Projetor();
        PlayerStreaming player = new PlayerStreaming();
        Telao telao = new Telao();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amplificador, luzes, pipoca, projetor, player, telao);

        homeTheater.assistirFilme("De Volta para o Futuro");
        System.out.println();
        homeTheater.fimDoFilme();
    }
}
