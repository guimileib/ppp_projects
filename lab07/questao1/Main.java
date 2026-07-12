package questao1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Preto", "Toyota", "Corolla"));
        veiculos.add(new Bicicleta("Vermelha"));
        veiculos.add(new Onibus(45, 2018));

        VeiculoVisitor imprimirDados = new ImprimirDadosVisitor();
        VeiculoVisitor enviarMensagem = new EnviarMensagemVisitor();

        System.out.println("Dados veiculos: ");
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(imprimirDados);
        }

        System.out.println("\nEnviar mensagem para os donos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.accept(enviarMensagem);
        }
    }
}
