package questao1;

public class Pizzaria {
    public static void main(String[] args) {
        Pizza marguerita = new MassaFinaPizza();
        marguerita = new Queijo(marguerita);
        marguerita = new Tomate(marguerita);
        System.out.println("Marguerita: " + marguerita.getDescricao());
        System.out.printf("Custo: R$ %.2f%n%n", marguerita.getCusto());

        Pizza portuguesa = new MassaEspessaPizza();
        portuguesa = new Queijo(portuguesa);
        portuguesa = new Ovo(portuguesa);
        portuguesa = new Tomate(portuguesa);
        System.out.println("Portuguesa: " + portuguesa.getDescricao());
        System.out.printf("Custo: R$ %.2f%n%n", portuguesa.getCusto());

        Pizza especial = new MassaEspessaPizza();
        especial = new Queijo(especial);
        especial = new Queijo(especial);
        especial = new Tomate(especial);
        especial = new Cebola(especial);
        especial = new Ovo(especial);
        System.out.println("Especial: " + especial.getDescricao());
        System.out.printf("Custo: R$ %.2f%n", especial.getCusto());
    }
}
