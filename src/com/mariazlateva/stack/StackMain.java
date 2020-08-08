package com.mariazlateva.stack;

import java.util.EmptyStackException;

class StackMain {
    public static void main(String[] args) {
        MyStack stack = new MyStackTrainingClassImpl(5);
        stack = new MyStackListImpl();

        for (int i = 0; i < 7; i++) {
            System.out.println("Pushing " + (i + 1));
            stack.push(i + 1);
            stack.printStack();
            System.out.println("----------------");

        }
        System.out.println("\nStack size = "+stack.size());
        System.out.println("Peek pop element = "+ stack.peek());

        for (int i = 0; i < 6; i++) {
            System.out.println("Popping ("+stack.pop()+" )");
            stack.printStack();
            System.out.println("----------------");
        }
        System.out.println("\nStack size = "+ stack.size());
        System.out.println("Peek pop element"+ stack.peek());

        try {
            int value = stack.pop();
            System.out.println("Value = "+ value);
            //stack.pop();
            stack.peek();
        }catch (EmptyStackException e){
            System.out.println("Empty Stack Exception "+ e.getMessage());
        }catch (NullPointerException npe){
            System.out.println("Null Pointer Exception "+ npe.getMessage());
        }
    }//end of main method

}//end of class StackMain
