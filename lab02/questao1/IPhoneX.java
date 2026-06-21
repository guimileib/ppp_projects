public class IPhoneX implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("[iPhone X] discando via FaceTime/celular...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[iPhone X] foto tirada com a camera dupla de 12MP.");
    }
}
