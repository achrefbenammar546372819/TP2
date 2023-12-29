package EX2.Class.Duck;
import EX2.Interface.*; 
public class MallardDuck extends Duck implements Flyable , Quackable  {
    public void swim(){
        System.out.println("I am a Mallard Duck Swimming!");
    }   
    public void display (){
        System.out.println("I am a Mallard Duck being displayed"); 
    }
    public void quack(){
        System.out.println("I am a Mallard Duck Quacking Quak Quack !"); 

    }
    public void fly(){
        System.out.println("I am a Mallard Duck flying !"); 

    }
}
