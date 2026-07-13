package lab04.questao3;

public class Amplificador {
    public boolean tomada;
    public double volume;

    public void ligarTomada(){
        System.out.println("Ligando Amplificador.");
        setTomada(true);
    }

    public void ajustarVolume(double volume){
        System.out.println("Ajustando o volume em: db " + volume);
        setVolume(volume);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean getTomada() {
        return tomada;
    }

    public void setTomada(boolean tomada) {
        this.tomada = tomada;
    }

}
