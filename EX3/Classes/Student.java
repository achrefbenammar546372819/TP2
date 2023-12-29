package EX3.Classes;
import EX3.Interfaces.*;
public class Student implements LibraryUser {
    Book borrowedBook ; 
    protected studentLibraryCard studentLibraryCard ; 

    public Student(int id , String name , Library library ){
        this.studentLibraryCard = new studentLibraryCard(id, name, library); 
        borrowedBook = null ; 
    }   


    public void borrowBook(String title , String author , Library library){
        for (Book b : library.inventory){
            if (b.GetAuthor().equals(author) && b.GetTitle().equals(title)){
                this.borrowedBook = b ; 
                library.RemoveBook(b);
            }
        }
    }

    public void returnBook(Library library ){
        library.AddBook(this.borrowedBook);
        this.borrowedBook = null; 
    }

    class studentLibraryCard{
        int id ; 
        String student_name ; 
        Library library ; 
        public studentLibraryCard(int id , String student_name , Library library){
            this.id = id ; 
            this.student_name = student_name;
            this.library = library ; 
        }
    }
}
