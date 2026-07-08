package lab03.questao2;

public class CalculadoraAdapter implements Calculadora {
    // composição 
    private CalculadoraBinaria calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinaria calculadoraBinaria){
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override 
    public int somar(int a, int b){
        // converto pra binario
        String binA = Integer.toBinaryString(a); 
        String binB = Integer.toBinaryString(b);
        String resBin = calculadoraBinaria.somar(binA, binB);
        return Integer.parseInt(resBin,2); // passo para int
    }

    @Override
    public int subtrair(int a, int b){
        String binA = Integer.toBinaryString(a);
        String binB = Integer.toBinaryString(b);
        String resBin = calculadoraBinaria.subtrair(binA, binB);
        return Integer.parseInt(resBin,2);
    }


    // em binario nao tem multiplicacao, mantenho int
    @Override
    public int multiplicar(int a, int b){
        return a * b;
    }
}
