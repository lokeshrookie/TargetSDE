package Implementations;

import java.util.*;
public class IStack {

    private int top;
    private int size;
    private int[] stackArray;

    public IStack(int size){
        stackArray = new int[size];
        top = -1;
    }

    // isFull
    public boolean isFull(){
        return getSize() >= stackArray.length;
    }

    // Push
    public void push(int val){
        if(isFull()){
            throw new StackOverflowError();
        }

        stackArray[++top] = val;
    }

    // Pop

    public int pop(){
        if(isEmpty()){
            throw new  EmptyStackException();
        }
        int popped = stackArray[top];
        stackArray[top--] = -1;
        return popped;
    }

    // peek
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    // isEmpty
    public boolean isEmpty(){
        return top==-1;
    }

    // size();
    public int getSize(){
        return top+1;
    }

    // print stack
    public void printStack(){
        for (int i = 0; i < stackArray.length; i++) {
            System.out.println(stackArray[i]);
        }
    }
}


class Test{
    public static void main(String[] args) {
        IStack stack = new IStack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());


//        stack.printStack();
    }
}