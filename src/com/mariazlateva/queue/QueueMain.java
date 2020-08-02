package com.mariazlateva.queue;

class QueueMain {

    public static void main(String[] args) {
        MyQueue queue = new MyQueueImpl(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        // |1|2|3|4|0 - front=0, back=4

        System.out.println("removing " + queue.remove()); //1
        // |0|2|3|4|0 - front = 1, back = 4

        System.out.println("removing " + queue.remove()); //2
        // |0|0|3|4|0 - front = 2, back = 4

        queue.add(5);
        // |0|0|3|4|5 - front = 2, back = 0

        System.out.println("removing " + queue.remove());//3
        // |0|0|0|4|5 - front = 3, back = 0

        queue.add(6);
        // |6|0|0|4|5 - front = 3, back = 1

        System.out.println("peek = " + queue.peek()); //4
        System.out.println("size = " + queue.size()); //3

        queue.print();
        queue.add(7);
        queue.add(8);
        System.out.println("size = " + queue.size());//5
        //resized
        System.out.println("------");
        queue.add(9);
        System.out.println("size = " + queue.size());//5
        System.out.println("peek = " + queue.peek());//4
        queue.print();
    }//end of main method
}//end of class QueueMain
