import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> BorrowerCollection;

    public Borrower(String name){
        this.name = name;
        this.BorrowerCollection = new ArrayList<Book>();
    }

    public int getCollectionTotal(){
        return this.BorrowerCollection.size();
    }

    public void addBookToCollection(Book book){
        this.BorrowerCollection.add(book);
    }

    public void getBookFromLibrary(Library library, Book book){
        library.removeBook(book);
        addBookToCollection(book);
    }


}

