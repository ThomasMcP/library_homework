import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryStock;
    private int stockCapacity;

    public Library(int stockCapacity){
        this.libraryStock = new ArrayList<Book>();
        this.stockCapacity = stockCapacity;
    }

    public int checkStockNumber(){
        return libraryStock.size();
    }

    public void addBook(Book book){
        if (checkStockNumber() < stockCapacity ){
            libraryStock.add(book);
        } else {
            System.out.println("No more room for books!");
        }
    }

    public void removeBook(Book book){
        libraryStock.remove(book);
    }
}
