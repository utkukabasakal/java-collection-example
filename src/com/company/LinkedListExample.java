package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String[] args){
        LinkedList<Integer> liste = new LinkedList<Integer>();
        liste.add(5);
        liste.add(8);
        liste.add(24);
        liste.add(57);
        System.out.println(liste);
        System.out.println("---------------");
        //
        //
        liste.addFirst(2);
        System.out.println(liste);
        System.out.println("---------------");
        //
        //
        liste.addLast(69);
        System.out.println(liste);
        System.out.println("---------------");
        //
        //
        liste.add(2,6);
        System.out.println(liste);
    }
}
