public class CalculadoraAdapter implements Calculadora {

    private final CalculadoraBinaria binaria;

    public CalculadoraAdapter(CalculadoraBinaria binaria) {
        this.binaria = binaria;
    }

    @Override
    public int somar(int a, int b) {
        String resultado = binaria.somar(paraBinario(a), paraBinario(b));
        return paraDecimal(resultado);
    }

    @Override
    public int subtrair(int a, int b) {
        String resultado = binaria.subtrair(paraBinario(a), paraBinario(b));
        return paraDecimal(resultado);
    }

    @Override
    public int multiplicar(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado = somar(resultado, a);
        }
        return resultado;
    }

    private String paraBinario(int valor) {
        return Integer.toBinaryString(valor);
    }

    private int paraDecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }
}
