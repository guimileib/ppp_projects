package lab04.questao3;

public class Telao {
    private boolean estado;
    // 1 = subir telao, 0 = descer
    public void subirTelao(){
        if(estado == true){
            System.out.println("Telao ja subiu");
        } else {
            setEstado(true);
            System.out.println("Subindo Telao");
        }
        
    }

    public void descerTelao(){
        if(estado == false) {
            System.out.println("Telao já está abaixado");
        } else {
            setEstado(false);
            System.out.println("Abaixando");
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
