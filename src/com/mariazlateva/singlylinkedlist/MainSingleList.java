package com.mariazlateva.singlylinkedlist;

import java.util.NoSuchElementException;

public class MainSingleList {
    public static void main(String[] args) {
        SingleList list = new SinglyLinkedList();
        list.addToFront(5);
        list.addToFront(4);
        list.addToFront(3);

        list.print();
        System.out.println("Size = " + list.size());
        System.out.println("List isEmpty = " + list.isEmpty());
        System.out.println("========");
        System.out.println("List Remove From Front = " + list.removeFromFront());
        list.print();
        System.out.println("List size = " + list.size());
        System.out.println("List isEmpty = " + list.isEmpty());

        System.out.println("========");
        System.out.println("List Remove From Front = " + list.removeFromFront());
        list.print();
        System.out.println("List size = " + list.size());
        System.out.println("List isEmpty = " + list.isEmpty());

        System.out.println("========");

        list.addToFront(1);
        list.print();
        System.out.println("List size = " + list.size());
        System.out.println("List isEmpty = " + list.isEmpty());
        System.out.println("========");
        System.out.println("List Remove From Front = " + list.removeFromFront());
        System.out.println("List Remove From Front = " + list.removeFromFront());
        System.out.println("List size = " + list.size());
        System.out.println("List isEmpty = " + list.isEmpty());

        System.out.println("========");
        try {
            list.removeFromFront();
        } catch (NoSuchElementException e) {
            System.out.println("No Such Element Exception: " + e.getMessage());
        }
        System.out.println("______________________________--");
        SingleList singleList = new SinglyLinkedList();
        singleList.addInOrder(10);
        singleList.addInOrder(9);
        singleList.addInOrder(15);
        singleList.addInOrder(8);
        singleList.addInOrder(12);
        singleList.addInOrder(14);
        singleList.addInOrder(11);

        singleList.print();
        System.out.println("List size = "+ singleList.size());
    }//end of main method

}//end of class MainSingleList
