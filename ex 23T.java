package com.company;
import java.util.Scanner;

public class Ex 23 Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex423 tl = new Ex 23();
        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter number: ", i+1);
            tl.enterNumber(sc.nextInt());
        }
        System.out.printf("First largest number: %d\n",
                tl.getFirstLargest());
        System.out.printf("Second largest number: %d\n", tl.getSecondLargest());
    }
}