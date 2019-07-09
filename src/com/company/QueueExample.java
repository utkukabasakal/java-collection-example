package com.company;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Ali");
        queue.offer("Veli");
        queue.offer("Ayse");
        queue.offer("Kubra");
        queue.offer("Gizem");
        queue.offer("Furkan");
        queue.offer("Tugce");
        //
        //
        Iterator iterator = queue.iterator();
        System.out.println("Boyut : "+ queue.size());
        System.out.println("---------------");
        //
        //
        while (iterator.hasNext()) {
            String iteratorValue = (String) iterator.next();
            System.out.println(iteratorValue);
        }
        System.out.println("---------------");
        //
        //
        System.out.println("Son eklenen elemanı :" + queue.peek());
        System.out.println("En bastakini silip sıradakini okur (1):" + queue.poll());
        System.out.println("En bastakini silip sıradakini okur (2):" + queue.poll());
        System.out.println("Kuyrugun kalan oge sayisi :" + queue.size());
    }
}
