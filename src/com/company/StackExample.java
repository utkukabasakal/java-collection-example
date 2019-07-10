package com.company;

import java.util.Stack;

public class StackExample {
    public static void main (String[] args){
        Stack <String> takım = new Stack<String>();
        takım.push("Fenerbahce");
        takım.push("Besiktas");
        takım.push("Galatasaray");
        takım.push("Sivasspor");

        System.out.println(takım);
        System.out.println("---------------");
        //
        //
        for (String tkm:takım){
            System.out.println(tkm);
        }
        System.out.println("---------------");
        //
        //
        takım.push("Trabzonspor");
        System.out.println(takım);
        System.out.println("---------------");
        //
        //
        takım.pop();
        System.out.println(takım);
    }
}
