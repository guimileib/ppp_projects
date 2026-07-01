public class MostrarBook{
    
    // metodo recebe um Book do tipo book
    public void printarAutor(Book book){
        System.out.println("Nome do autor ->" + book.getAuthor());// acessa o get de Book
    }

    public void printarTitulo(Book book){
        System.out.println("Nome do titulo ->" + book.getTitle());
    }

    public void printarGenero(Book book){
        System.out.println("Nome do Gênero ->" + book.getGenre());
    }
}
