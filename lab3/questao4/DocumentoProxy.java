public class DocumentoProxy implements Documento {

    private final String nomeArquivo;
    private final String perfilUsuario;

    private DocumentoReal documentoReal;

    public DocumentoProxy(String nomeArquivo, String perfilUsuario) {
        this.nomeArquivo = nomeArquivo;
        this.perfilUsuario = perfilUsuario;
    }

    @Override
    public String ler() {
        if (!"ADMIN".equals(perfilUsuario)) {
            return "ACESSO NEGADO: perfil '" + perfilUsuario + "' nao pode ler este documento.";
        }

        if (documentoReal == null) {
            documentoReal = new DocumentoReal(nomeArquivo);
        }

        return documentoReal.ler();
    }
}
