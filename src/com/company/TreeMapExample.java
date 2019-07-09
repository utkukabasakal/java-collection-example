package com.company;

import java.util.TreeMap;

public class TreeMapExample {
    public  static void main(String []args){

        TreeMap<Integer ,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(1,"A");
        treeMap.put(2,"B");
        treeMap.put(3,"C");
        treeMap.put(4,"D");
        System.out.println(treeMap.toString());
        //
        //
        System.out.println("------------------------");
        treeMap.clone();
        System.out.println(treeMap);
        System.out.println("------------------------");
        //
        //
        treeMap.remove(2);
        System.out.println(treeMap);
    }
}
