package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 13-Dec-16.
 */
public class ReverseChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter1 = scan.nextLine();
        String letter2 = scan.nextLine();
        String letter3 = scan.nextLine();
        System.out.print(letter3+letter2+letter1);
    }
}
