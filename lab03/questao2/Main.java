package lab03.questao2;

public class Main {
    public static void main(String[] args) {
        CalculadoraBinaria binaria = new CalculadoraBinaria();
        
        System.out.println("Operações binárias: "+ binaria.somar("101", "101"));
        System.out.println("");

        CalculadoraAdapter calc = new CalculadoraAdapter(binaria);

        System.out.println("Soma: "+ calc.somar(1, 2));
        System.out.println("Multiplicacao: "+ calc.multiplicar(5, 4));
    }
}
