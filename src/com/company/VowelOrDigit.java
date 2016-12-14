package com.company;

import java.util.Scanner;

/**
 * Created by Simona Simeonova on 13-Dec-16.
 */
public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.equals("a") || input.equals("e") || input.equals("o")|| input.equals("u") || input.equals("i")){
            System.out.println("vowel");
        }
        else if (input.equals("0") || input.equals("1") || input.equals("2") || input.equals("3")
                || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") ||
                input.equals("8") || input.equals("9")){
            System.out.println("digit");
        }
        else
        {
            System.out.println("other");
        }
    }
}
