package EX2.Interface;

public interface Flyable {
    public default void fly(){
        System.out.println("I am flying"); 
    } 
}
