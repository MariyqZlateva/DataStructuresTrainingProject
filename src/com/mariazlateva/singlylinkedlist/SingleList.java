package com.mariazlateva.singlylinkedlist;

public interface SingleList {

    void addToFront(int value);

    int removeFromFront();

    void addInOrder(int value);

    int size();

    boolean isEmpty();

    void print();

}//end of interface SingleList
