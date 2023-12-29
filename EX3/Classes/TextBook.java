package EX3.Classes;

public class TextBook extends Book  {
    public TextBook (String title , String author , int year_of_publication){
        super(title , author , year_of_publication); 
    }

    public void DisplayInfo(){
        System.out.println("This is a TextBook titled " + this.GetTitle());
        System.out.println("Authored By " + this.GetAuthor());
        System.out.println("Published in " + this.GetYearOfPublication());

    }
}
