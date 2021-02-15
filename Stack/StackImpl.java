package Stack;

public class StackImpl {

    private int arr[];
    private int top;
    private int capacity;

    //Creating a stack
    StackImpl(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //Add elements into stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    //Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    //Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    public int peek(){
       if (isEmpty()){
          return Integer.MIN_VALUE;
       }else {
         return this.arr[this.top];
       }
    }

    public void printStack() {
        for (int i = 0; i <= top;i++ ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("-----------------------");

        stack.peek();
        System.out.println(String.format("%d peeked", stack.peek()));

        System.out.println("-----------------------");
        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();

    }

}
