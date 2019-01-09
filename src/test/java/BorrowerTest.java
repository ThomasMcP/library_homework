import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Library library;
    Book book;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library(30);
        book = new Book("Harry Potter and the Chamber of Secrets", "J.K Rowling", "Fantasy");
        borrower = new Borrower("Thomas McPhee");
    }

    @Test
    public void checkBorrowerCollectionIsZero(){
        assertEquals(0, borrower.getCollectionTotal());
    }

    @Test
    public void canAddBookFromLibraryToBorrower(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.checkStockNumber());
        borrower.getBookFromLibrary(library, book);
        assertEquals(1, library.checkStockNumber());
        assertEquals(1, borrower.getCollectionTotal());
    }
}
