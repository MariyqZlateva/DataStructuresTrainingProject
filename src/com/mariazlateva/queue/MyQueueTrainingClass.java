package com.mariazlateva.queue;

class MyQueueTrainingClass implements MyQueue {

    private int[] queue;
    private int front;
    private int back;

    public MyQueueTrainingClass(int capacity) {
        if (capacity <= 0) {
            this.queue = new int[10];
        } else {
            this.queue = new int[capacity];
        }
        this.front = 0;
        this.back = 0;
    }//end of constructor

    @Override
    public void add(int value) {

    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void print() {

    }

}//end of class MyQueueTrainingClass
