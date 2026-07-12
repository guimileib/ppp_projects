package questao2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> document = new ArrayList<>();
        document.add(new Paragraph("O padrao Visitor separa algoritmos da estrutura de objetos"));
        document.add(new Image("diagrama.png", "diagrama do padrao Visitor"));
        document.add(new Table(Arrays.asList(
                Arrays.asList("Nome", "Tipo"),
                Arrays.asList("Paragraph", "Elemento"),
                Arrays.asList("Image", "Elemento")
        )));
        document.add(new Paragraph("Adicionar um novo formato nao exige alterar os elementos."));

        HtmlExportVisitor htmlVisitor = new HtmlExportVisitor();
        PdfExportVisitor pdfVisitor = new PdfExportVisitor();
        WordCountVisitor wordCountVisitor = new WordCountVisitor();

        for (DocumentElement element : document) {
            element.accept(htmlVisitor);
            element.accept(pdfVisitor);
            element.accept(wordCountVisitor);
        }

        System.out.println("=== Exportacao para HTML ===");
        System.out.println(htmlVisitor.getResult());

        System.out.println("=== Exportacao para PDF ===");
        System.out.println(pdfVisitor.getResult());

        System.out.println("=== Contagem de palavras ===");
        System.out.println("Total de palavras: " + wordCountVisitor.getCount());
    }
}
