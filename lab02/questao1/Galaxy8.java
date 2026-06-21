public class Galaxy8 implements Celular {

    @Override
    public void fazLigacao() {
        System.out.println("[Galaxy 8] chamando contato pelo discador da Samsung...");
    }

    @Override
    public void tiraFoto() {
        System.out.println("[Galaxy 8] foto capturada (12MP, modo automatico).");
    }
}
