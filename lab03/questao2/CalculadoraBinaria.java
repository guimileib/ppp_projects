package lab03.questao2;

public class CalculadoraBinaria {
    // exemplo paserInt('101', 2) = retorna 5, 101 em binario
    public String somar(String a, String b) {
        int decimalA = Integer.parseInt(a, 2);  // le string e transforma base binaria
        int decimalB = Integer.parseInt(b, 2);
        int resultado = decimalA + decimalB;
        return Integer.toBinaryString(resultado); 
    }

    public String subtrair(String a, String b) {
        int decimalA = Integer.parseInt(a, 2);
        int decimalB = Integer.parseInt(b, 2);
        int resultado = decimalA - decimalB;
        return Integer.toBinaryString(resultado);
    }
}
