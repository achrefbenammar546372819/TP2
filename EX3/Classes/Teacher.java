package EX3.Classes;

import EX3.Interfaces.LibraryUser;

public class Teacher implements LibraryUser {
    Book borrowedBook ; 
    protected teacherLibraryCard teacherLibraryCard ; 

    public Teacher(int id , String name , Library library ){
        this.teacherLibraryCard = new teacherLibraryCard(id, name, library); 
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
    class teacherLibraryCard{
        int id ; 
        String teacher_name ; 
        Library library ; 
        public teacherLibraryCard(int id , String teacher_name , Library library){
            this.id = id ; 
            this.teacher_name = teacher_name;
            this.library = library ; 
        }
    }
}
