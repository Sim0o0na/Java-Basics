package com.company;

import java.util.Scanner;
import java.util.HashMap;

/**
 * Created by Simona Simeonova on 13-Dec-16.
 */
public class MaxOfIncreasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] sequence = input.split(" ");

        int[] numbers = new int[sequence.length];
        for (int i = 0; i<sequence.length; i++){
            numbers[i] = Integer.parseInt(sequence[i]);
        }

        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i<numbers.length; i++){
            if(hmap.containsKey(numbers[i])){
                Integer prevVal = hmap.get(numbers[i]);
                hmap.put(numbers[i], prevVal + 1);
            }else{
                hmap.put(numbers[i], 1);
            }
        }

        Integer maxValue = 0;
        Integer maxValuedKey=0;
        for (Integer key : hmap.keySet()) {
            if(hmap.get(key)>maxValue){
                maxValue=hmap.get(key);
                maxValuedKey=key;
            }
        }
        System.out.print(maxValuedKey);
    }
}
