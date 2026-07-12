package questao2;

import java.util.List;

public class HtmlExportVisitor implements DocumentVisitor {
    private StringBuilder output = new StringBuilder();

    @Override
    public void visit(Paragraph paragraph) {
        output.append("<p>").append(paragraph.getText()).append("</p>\n");
    }

    @Override
    public void visit(Image image) {
        output.append("<img src=\"").append(image.getSource())
                .append("\" alt=\"").append(image.getAltText()).append("\" />\n");
    }

    @Override
    public void visit(Table table) {
        output.append("<table>\n");
        for (List<String> row : table.getRows()) {
            output.append("  <tr>");
            for (String cell : row) {
                output.append("<td>").append(cell).append("</td>");
            }
            output.append("</tr>\n");
        }
        output.append("</table>\n");
    }

    public String getResult() {
        return output.toString();
    }
}
