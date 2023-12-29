package EX2;
import EX2.Class.Duck.MallardDuck;
import EX2.Class.Duck.RedheadDuck;
import EX2.Class.Duck.RubberDuck;
import EX2.Interface.Flyable;
import EX2.Interface.Quackable; 
public class Test {
    public static void main(String[] args ){
        Flyable flyers [] = new Flyable[2] ; 
        flyers[0] = new MallardDuck(); 
        flyers[1] = new RedheadDuck(); 
        for (int i = 0 ; i < flyers.length ; i ++){
            flyers[i].fly(); 
            
        }
        Quackable quakies []= new Quackable[3]; 
        quakies[0] = new MallardDuck(); 
        quakies[1] = new RubberDuck(); 
        quakies[2] = new RedheadDuck(); 
        for (int i = 0 ; i < quakies.length ; i ++ ){
            quakies[i].quack();
        }


}
}
