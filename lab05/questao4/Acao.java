package questao4;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private String codigo;
    private double preco;
    private List<Observador> investidores;

    public Acao(String codigo, double preco) {
        this.codigo = codigo;
        this.preco = preco;
        this.investidores = new ArrayList<>();
    }

    public void registra(Observador investidor) {
        investidores.add(investidor);
    }

    public void remove(Observador investidor) {
        investidores.remove(investidor);
    }

    public void notifica() {
        List<Observador> copia = new ArrayList<>(investidores);
        for (Observador investidor : copia) {
            investidor.atualiza(codigo, preco);
        }
    }

    public void setPreco(double preco) {
        this.preco = preco;
        System.out.printf("%n[%s] Novo preco: R$ %.2f%n", codigo, preco);
        notifica();
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }
}
