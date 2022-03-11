package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        //For Array
        int[] array = new int[10];
        for(int i = 1;i<array.length;i++){
            array[i] = random.nextInt(0,2);
        }
        Arrays.sort(array);

        //For ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0;i< 10;i++){
            arrayList.add(random.nextInt(2));
        }
        Collections.sort(arrayList);

        //For LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0;i<10;i++){
            linkedList.add(random.nextInt(2));
        }
        Collections.sort(linkedList);


        //Sorted Array
        randoms(array);
        System.out.println(" ");
        //Sorted ArrayList
        randoms(arrayList);
        System.out.println(" ");
        //Sorted LinkedList
        randoms(linkedList);
    }

        public static int[] randoms(int[] number){
                for(int i : number){
                    if(i==0){
                    System.out.print(i+" ");
                    }
                    if(i==1){
                        System.out.print(i+" ");
                    }

                }
            return number;
        }
        public static ArrayList<Integer> randoms(ArrayList<Integer> number) {
            for (int i : number) {
                if (i == 0) {
                    System.out.print(i + " ");
                }
                if (i == 1) {
                    System.out.print(i + " ");
                }
            }
            return number;

        }
            public static LinkedList<Integer> randoms(LinkedList < Integer > number) {
                for (int i : number) {
                    if (i == 0) {
                        System.out.print(i + " ");
                    }
                    if (i == 1) {
                        System.out.print(i + " ");
                    }
                }
                return number;

            }

}
