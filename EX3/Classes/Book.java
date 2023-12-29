package EX3.Classes;

public abstract class Book {
    private String title ;
    private String author ; 
    private int year_of_publication; 

    public String GetTitle(){return this.title;}
    public String GetAuthor(){return this.author;}
    public int GetYearOfPublication(){return this.year_of_publication;}

    public Book (String author , String title , int year_of_publication ){
        this.author = author ; 
        this.year_of_publication = year_of_publication; 
        this.title = title; 
    }

    public abstract void DisplayInfo();

}
