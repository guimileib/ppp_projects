package questao2;

import java.util.List;

public class PdfExportVisitor implements DocumentVisitor {
    private StringBuilder output = new StringBuilder();

    @Override
    public void visit(Paragraph paragraph) {
        output.append("[PDF Texto] ").append(paragraph.getText()).append("\n");
    }

    @Override
    public void visit(Image image) {
        output.append("[PDF Imagem] ").append(image.getSource())
                .append(" (").append(image.getAltText()).append(")\n");
    }

    @Override
    public void visit(Table table) {
        output.append("[PDF Tabela]\n");
        for (List<String> row : table.getRows()) {
            output.append("  ").append(String.join(" | ", row)).append("\n");
        }
    }

    public String getResult() {
        return output.toString();
    }
}
