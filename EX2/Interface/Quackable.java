package EX2.Interface;

public interface Quackable {
    public default void quack(){
        System.out.println("Quack Quack");
    }
    
}
