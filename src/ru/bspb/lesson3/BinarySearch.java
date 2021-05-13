package ru.bspb.lesson3;

public class BinarySearch {
    public static void main(String[] args) {
        int a1 []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int find = 13;
        int a = a1.length;
        int a0 = a/2;
        int a2 [] = new int[a0];
        int a3 [] = new int[a0];
        for (int i = 0; i <= Math.log(a1.length)/Math.log(2); i++) {
            if (a0==find) {
                System.out.println("Your number is " +a0);
            }
            else if (a0>find){
                for (int j = 0; j < a0; j++) {
                    a2[j]= a1[a1.length-a0+j];
                }
                a0 = a0/2;
            }
            else {
                for (int j = 0; j < a0; j++) {
                    a3[j] = a1[j];
                }
                a0 = a0/2;
            }





        }
    }
}
