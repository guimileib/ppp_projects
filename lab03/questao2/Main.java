public class Main {

    public static void main(String[] args) {

        CalculadoraBinaria binaria = new CalculadoraBinaria();

        System.out.println("== Operacoes binarias (calc original) ==");
        System.out.println("101 + 011 = " + binaria.somar("101", "011"));
        System.out.println("1010 - 0011 = " + binaria.subtrair("1010", "0011"));

        Calculadora calc = new CalculadoraAdapter(binaria);

        System.out.println();
        System.out.println("== Operacoes decimais (via Adapter) ==");
        System.out.println("5 + 3 = " + calc.somar(5, 3));
        System.out.println("10 - 3 = " + calc.subtrair(10, 3));
        System.out.println("4 * 6 = " + calc.multiplicar(4, 6));
    }
}
