package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 13-Dec-16.
 */
public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strArray = input.split(" ");
        Integer[] intArray = new Integer[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < intArray.length; i++)
        {
            Integer leftSum = SumLeft(intArray, i);
            Integer rightSum = SumRight(intArray, i);
            if (leftSum.equals(rightSum))
            {
                System.out.println(i);
                return;
            }

        }
        System.out.println("no");

    }
    public static int SumLeft(Integer[] array, int position){
        int leftSum = 0;

        for(int i = position; i>0; i--){
            int nextPosition = i-1;
            if(i==0){
                leftSum+=0;
                break;
            }else{
                leftSum+=array[nextPosition];
            }
        }
        return leftSum;
    }
    public static int SumRight(Integer[] array, int position){
        int rightSum = 0;

        for(int i = position; i<array.length; i++){
            int nextPosition = (i+1)%array.length;
            if(array.length == 1 || nextPosition == 0){
                rightSum+=0;
                break;
            }else{
                rightSum+=array[nextPosition];
            }
        }
        return rightSum;
    }
}
