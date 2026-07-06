public class DocumentoReal implements Documento {

    private final String nomeArquivo;
    private final String conteudo;

    public DocumentoReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        System.out.println("[DocumentoReal] carregando '" + nomeArquivo + "' do disco (operacao cara)...");
        this.conteudo = "Conteudo confidencial de " + nomeArquivo;
    }

    @Override
    public String ler() {
        return conteudo;
    }
}
