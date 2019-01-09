import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;

    @Before
    public void before() {
        book = new Book("Harry Potter and the Chamber of Secrets", "J.K Rowling", "Fantasy");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Harry Potter and the Chamber of Secrets", book.getTitle());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("J.K Rowling", book.getAuthor());
    }


}
