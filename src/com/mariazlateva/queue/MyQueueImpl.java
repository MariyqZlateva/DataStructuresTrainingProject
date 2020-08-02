package com.mariazlateva.queue;

import java.util.NoSuchElementException;

public class MyQueueImpl implements MyQueue {
    //== fields ==
    private int[] queue;
    private int front;
    private int back;

    //==constructor==
    public MyQueueImpl(int capacity) {
        if (capacity <= 0) {
            this.queue = new int[10];
        } else {
            this.queue = new int[capacity];
        }
        this.front = 0;
        this.back = 0;
    }//end of constructor
    //==public methods==

    @Override
    public void add(int value) {
        if (this.size() == this.queue.length - 1) {
            int[] replacingQueue = new int[2 * this.queue.length];
            int numElem = this.size();
            if (this.isNotWrapped()) {
                for (int i = this.front, j = 0; i < this.back; i++, j++) {
                    replacingQueue[j] = this.queue[1];

                }
            } else {
                int j = 0;
                for (int i = this.front; i < this.queue.length; i++) {
                    replacingQueue[j] = this.queue[1];
                }
                for (int i = 0; i < this.back; i++, j++) {
                    replacingQueue[j] = this.queue[1];
                }
            }
            this.queue = replacingQueue;
            this.front = 0;
            this.back = numElem;
        }
        this.queue[this.back] = value;
        if (this.back == this.queue.length - 1) {
            this.back = 0;
        } else {
            this.back++;
        }
    }

    @Override
    public int remove() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        int removedElement = this.queue[this.front];
        this.queue[this.front] = 0;
        this.front++;
        if (this.isEmpty()) {
            this.front = 0;
            this.back = 0;
        }
        if (this.front == this.queue.length) {
            this.front = 0;
        }
        return removedElement;
    }

    @Override
    public int peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.queue[this.front];

    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public int size() {
        if (this.isNotWrapped()) {
            return this.back - this.front;
        } else {
            return (this.back - this.front) + this.queue.length;
        }
    }

    @Override
    public void print() {
        if (this.isNotWrapped()) {
            for (int i = this.front; i < this.back; i++) {
                System.out.println("Queue Element:" + this.queue[i]);
            }
        } else {
            for (int i = this.front; i < this.queue.length; i++) {
                System.out.println("Queue Element: " + this.queue[i]);
            }
            for (int i = 0; i < this.back; i++) {
                System.out.println("Queue Element: " + this.queue[i]);
            }
        }
    }



    //==private methods==
    private boolean isNotWrapped() {
        return this.front <= this.back;
    }
}//end of class MyQueueImpl
