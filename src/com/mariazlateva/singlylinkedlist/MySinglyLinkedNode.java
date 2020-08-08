package com.mariazlateva.singlylinkedlist;

public class MySinglyLinkedNode implements SingleNode {

    //== fields ==
    private int data;
    private SingleNode next;

    //==constructor==
    public MySinglyLinkedNode(int value) {
        this.data = value;
        this.next = null;
    }//end of constructor

    //== public methods ==


    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }

    @Override
    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public SingleNode getNext() {
        return this.next;
    }
}//end of class MySinglyLinkedNode
