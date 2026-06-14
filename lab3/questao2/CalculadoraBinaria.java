public class CalculadoraBinaria {

    public String somar(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString(x + y);
    }

    public String subtrair(String a, String b) {
        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);
        return Integer.toBinaryString(x - y);
    }
}
