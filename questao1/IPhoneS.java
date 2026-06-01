public class IPhoneS implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("[iPhone S] iniciando ligacao...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[iPhone S] foto salva no rolo da camera.");
    }
}
