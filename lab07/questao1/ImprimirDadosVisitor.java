package questao1;

public class ImprimirDadosVisitor implements VeiculoVisitor {

    @Override
    public void visit(Carro carro) {
        System.out.println("Carro -> cor: " + carro.getCor() + ", marca: " + carro.getMarca() + ", modelo: " + carro.getModelo());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Bicicleta -> cor: "+ bicicleta.getCor());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Onibus -> quantidade de lugares: " + onibus.getQuantidadeLugares()+ ", ano de fabricacao: " + onibus.getAnoFabricacao());
    }
}
