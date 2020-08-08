package com.mariazlateva.stack;

import java.util.LinkedList;

 class MyStackListImpl implements MyStack {

    //== fields ==
    private LinkedList<Integer> stack;

    //== constructor ==
    public MyStackListImpl(){
        this.stack=new LinkedList<>();
    }//end of constructor
    //== public methods ==
    @Override
    public void push(int value) {
        this.stack.push(value);
    }

    @Override
    public int pop() {
        return this.stack.pop();
    }

    @Override
    public int peek() {
        return this.stack.peek();
    }

    @Override
    public int size() {
        return this.stack.size();
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public void printStack() {
        for (Integer integer : this.stack) {
            System.out.println("\t\t\t [" + integer + " ]");
        }
    }
}//end of class MyStackListImpl
