package com.mariazlateva.stack;


import java.util.EmptyStackException;

 class MyStackTrainingClassImpl implements MyStack {

    //==fields==
    private int[] stack;
    private int top;

    //==constructors==

    public MyStackTrainingClassImpl(int capacity) {
        if (capacity <= 0) {
            this.stack = new int[10];
        } else {
            this.stack = new int[capacity];
        }
        this.top = 0;
    }//end of constructor

    //==public methods==

    @Override
    public void push(int value) {
        if (this.top == this.stack.length) {
            int[] replacingStack = new int[2 * this.stack.length];
            System.arraycopy(this.stack, 0, replacingStack, 0, this.top);
            this.stack = replacingStack;
        }
        this.stack[this.top++] = value;
    }//end of method push

    @Override
    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedValue = this.stack[this.top - 1];
        this.stack[this.top - 1] = 0;
        this.top--;
        return poppedValue;
    }//end of method pop

    @Override
    public int peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack[this.top - 1];
    }//end of method peek

    @Override
    public int size() {
        return this.top;
    }//end of method size

    @Override
    public boolean isEmpty() {
        return this.top == 0;
    }//end of method isEmpty

    @Override
    public void printStack() {
        for (int i = this.top - 1; i >= 0; i--) {
            System.out.println("\t\t\t [ " + this.stack[i] + " ]");
        }
    }//end of method printStack
}//end of MyStackTrainingClassImpl class