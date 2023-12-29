  class CustomStackMain {
    public static void main(String[] args) {
        CustomStack myStack = new CustomStack(5); // Creating a stack with a maximum capacity of 5

        System.out.println("Is the stack empty? " + myStack.stackIsEmpty());

        myStack.addElement(10);
        myStack.addElement(20);

        myStack.addElement(30);
        myStack.addElement(30);
        myStack.addElement(30);

        System.out.println("Is the stack full? " + myStack.stackIsFull());

        System.out.println("Last element in the stack: " + myStack.lastInStack());

        myStack.removeElement();
        myStack.removeElement();

        System.out.println("Last element in the stack after two removals: " + myStack.lastInStack());

        myStack.addElement(40);
        myStack.addElement(50);
        myStack.addElement(60); // Trying to add more elements than the stack capacity

        System.out.println("Is the stack full? " + myStack.stackIsFull());
    }
}
