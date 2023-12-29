package EX2.Class.Duck;
import EX2.Interface.*; 
public class RedheadDuck extends Duck implements Quackable , Flyable {
    public void swim(){
        System.out.println("I am a RedHead Duck Swimming!");
    }   
    public void display (){
        System.out.println("I am a Redhead Duck being displayed"); 
    }
    public void quack(){
        System.out.println("I am a Redhead Duck Quacking Quak Quack !"); 

    }
    public void fly(){
        System.out.println("I am a Redhead Duck flying !"); 

    }
 
}
