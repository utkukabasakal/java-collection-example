package com.company;

import java.util.*;

public class HashSetExample {
    public static void main (String[] args){
    HashSet<String> ulke =new HashSet<String>();
        ulke.add("Turkiye");
        ulke.add("Rusya");
        ulke.add("Hollanda");
        ulke.add("Fransa");
        System.out.println(ulke);
        System.out.println("--------------");
    //
    //
        System.out.println(ulke.contains("Rusya"));
        System.out.println("--------------");
    //
    //
        ulke.remove("Hollanda");
        System.out.println(ulke);
        System.out.println("--------------");
    }
}
