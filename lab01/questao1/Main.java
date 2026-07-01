public class Main{
    public static void main(String[] args) {

        //instanciando livro atraves do construtor
        Book livro = new Book("Clean Archi", "Robert Martin", "Science");

        MostrarBook exibidor = new MostrarBook();

        //chama os 3 metodos passando o livro 
        exibidor.printarAutor(livro);
        exibidor.printarTitulo(livro);
        exibidor.printarGenero(livro);
        
    }
}