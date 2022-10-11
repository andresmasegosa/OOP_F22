package session6.a_generics;

public class Stack<T> {
    private T[] stack;
    int count=0;

    public Stack() {
        //stack = (T[]) new Object[100];
    }

    T pop() {
        return stack[--count];
    }
    void push(T o) {
        stack[count++]=o;
    }
    void printStack(){
        for(T o  : stack){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Giraff());
        stack.push(new Book());
        stack.printStack();
    }
}

