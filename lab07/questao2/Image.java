package questao2;

public class Image implements DocumentElement {
    private String source;
    private String altText;

    public Image(String source, String altText) {
        this.source = source;
        this.altText = altText;
    }

    public String getSource() {
        return source;
    }

    public String getAltText() {
        return altText;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
