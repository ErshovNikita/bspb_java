package ru.bspb.lesson3;

public class BS {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int low = 1;
        int high = list.length;
        int find = 15;
        if (find>high) {
            System.out.println("Your number is " + find +" It is bigger then the highest number in our range.");
        }
        else if (find<low) {
            System.out.println("Your number is " + find +" It is less then the smallest number in our range.");
        }
        else {
            while (low!=high) {
                int mid = (high-low)/2+low;
                if (find==mid) {
                    System.out.println("Your number is " + mid +".\nIsn't it?");
                    break;
                }
                else if (mid>find) {
                    high = mid -1;
                }
                else {
                    low = mid + 1;
                }
            }
            if (low==high) {
                System.out.println("Your number is "+low+".\nIsn't it?\nYou finally found it.");
            }
            else {
                System.out.println("You finally found it.");

            }
        }
    }
}
