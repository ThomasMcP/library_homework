import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(50);
        book = new Book("Harry Potter and the Chamber of Secrets", "J.K Rowling", "Fantasy");
    }

    @Test
    public void libraryStockIsIntiallyNothing(){
        assertEquals(0, library.checkStockNumber());
    }

    @Test
    public void canAddBookToStock(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.checkStockNumber());
    }

    @Test
    public void canRemoveBookFromStock(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.checkStockNumber());
        library.removeBook(book);
        assertEquals(1, library.checkStockNumber());
    }
}
