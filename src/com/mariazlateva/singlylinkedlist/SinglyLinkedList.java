package com.mariazlateva.singlylinkedlist;

import java.util.NoSuchElementException;

class SinglyLinkedList implements SingleList {

    //==fields ==
    private SingleNode head;
    private int size;

    //==constructors==
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }//end of constructor

    //==public methods


    @Override
    public void addToFront(int value) {
        if (this.head == null) {
            this.head = new MySinglyLinkedNode(value);
        } else {
            SingleNode newNode = new MySinglyLinkedNode(value);
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    @Override
    public int removeFromFront() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        SingleNode removedNode = this.head;
        this.head = this.head.getNext();
        removedNode.setNext(null);
        this.size--;
        return removedNode.getData();
    }

    @Override
    public void addOrder(int value) {

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void print() {
        if (this.isEmpty()) {
            System.out.println("The Singly List Is Empty");
        }
        SingleNode currentNode = this.head;
        while (currentNode != null) {
            System.out.print("( " + currentNode.getData() + " )");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}//end of class SinglyLinkedList
