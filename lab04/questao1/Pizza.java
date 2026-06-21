package questao1;

public abstract class Pizza {
    protected String descricao = "Pizza desconhecida";

    public String getDescricao() {
        return descricao;
    }

    public abstract double getCusto();
}
