package EX2.Class.Duck;
import EX2.Interface.*;
public class RubberDuck extends Duck implements Quackable {

    public void swim() {
        System.out.println("I am a Rubber Duck Quacking Quack Quack");
    }

    
    public void display() {
        System.out.println("I am a Rubber Duck being displayed");

    }

    public void quack(){
        System.out.println("I am a RubberDuck Duck Quacking Quak Quack !"); 

    }
    
}
