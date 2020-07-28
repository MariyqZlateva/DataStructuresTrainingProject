package com.mariazlateva.stack;

public class MyStackTrainingClassImpl implements MyStack {

    //== fields ==
    private int[] stack;
    private int top;

    // == constructors ==

    public MyStackTrainingClassImpl(int capacity) {
        if (capacity <= 0) {
            this.stack = new int[10];
        } else {
            this.stack = new int[capacity];
        }
        this.top = 0;
    }//end of constructor

    //==public methods ==

    @Override
    public void push(int value) {

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void printStack() {

    }

}//end of class MyStackTrainingClassImpl

