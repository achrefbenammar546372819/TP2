package EX3.Classes;
import java.util.ArrayList;

public class Library {
    public ArrayList <Book> inventory ; 

    public Library(){
        this.inventory = new ArrayList<>(); 
    }

    public void AddBook(Book book ){
        this.inventory.add(book); 
    }

    public void RemoveBook(Book book ){
        this.inventory.remove(book); 
    }

    public void ListInventory(){
        System.out.println("this is the inventory of this library");
        for (Book b : this.inventory){
            b.DisplayInfo(); 
        }
    }
}
