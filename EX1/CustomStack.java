


public class CustomStack {
    private Object[] stack;
    int idx;
    int capacity ;
    public CustomStack(int n){
        idx=-1;
        capacity=n;
        stack=new Object[n];
    }

    public void addElement(Object x){
        if (idx < capacity  - 1) {
            idx++;
            stack[idx] = x;
        } else {
            System.out.println("Stack Has No Space ");
        }

    }

    public void removeElement(){
        if(idx>=0)
            idx--;
        else{
            System.out.println("Stack is already empty !");
        }


    }
    Object  lastInStack(){
        if (idx>=0)
            return stack[idx];
        return null;
    }

    boolean stackIsEmpty(){
        return idx<0;
    }

    boolean stackIsFull(){
        return idx+1==capacity;
    }



}
