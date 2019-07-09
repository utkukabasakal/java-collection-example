package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Sivas");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("İstanbul");
        //
        //
        for (String sehir:sehirler){
            System.out.println(sehir);
        }
        System.out.println("--------------");
        //
        //
        sehirler.remove(0);
        Collections.sort(sehirler);
        System.out.println(sehirler);

    }
}
