package com.company;
/**
 * Created by Simona Simeonova on 13-Dec-16.
 */
import java.util.HashMap;
import java.util.Scanner;

public class IndexofLetters {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        int val = 0;
        for (char ch = 'a'; ch <= 'z'; ++ch){
            map.put(String.valueOf(ch), val);
            val++;
        }
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] sequence = input.split("");

        for (int i = 0; i<sequence.length; i++){
            System.out.println(sequence[i]+" -> "+map.get(sequence[i]));

        }
    }
}
