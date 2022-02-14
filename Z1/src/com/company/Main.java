package com.company;

import java.time.LocalTime;

public class Main {

    static class ArrayUtil {
        public static <T extends Comparable<T>> boolean isSorted(T[] array){
            for (int i= 0; i < array.length - 1; i++)
            {
                if (array[i+1].compareTo(array[i]) < 0) return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Integer[] niesorInt = new Integer[]{2,3,1,4,5,3,8};
        Integer[] posorInt = new Integer[]{1,2,3,4,5,6,7,8};
        LocalTime[] niesorTime = new LocalTime[]{
                LocalTime.of(12,30),
                LocalTime.of(12,45),
                LocalTime.of(10,12)
        };

        LocalTime[] posorTime = new LocalTime[]{
                LocalTime.of(10, 0),
                LocalTime.of(11,11),
                LocalTime.of(12,15)
        };

        String[] niesorString = new String[]{"Ala", "Max", "Basia"};
        String[] posorString = new String[]{"Ala", "Basia", "Max"};

        System.out.println("Nieposortowane: ");
        System.out.println(ArrayUtil.isSorted(niesorInt));
        System.out.println(ArrayUtil.isSorted(niesorTime));
        System.out.println(ArrayUtil.isSorted(niesorString));

        System.out.println("Posortowane: ");
        System.out.println(ArrayUtil.isSorted(posorInt));
        System.out.println(ArrayUtil.isSorted(posorTime));
        System.out.println(ArrayUtil.isSorted(posorString));
    }
}
