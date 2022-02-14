package com.company;

import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Elementy");
        str.add("podzielone");
        str.add("przecinkem");
        str.add("i");
        str.add("nawiasami");

        ArrayList<Integer> into = new ArrayList<>();
        into.add(1);
        into.add(2);
        into.add(3);

        Set<String> setstr = Set.of(str.get(0), str.get(1), str.get(2));

        print(str);
        System.out.println();
        print(into);
        System.out.println();
        print(setstr);


    }
    public static <T extends Iterable> void print(T t){
        t.forEach(x-> System.out.print("[" + x + "]" + ","));
    }
}
