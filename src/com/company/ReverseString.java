package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 17-Dec-16.
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        char[] charArray = input.toCharArray();
        for (int i = charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}
