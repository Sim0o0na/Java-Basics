package com.company;

import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int converted = Integer.parseInt(input, 16);
        System.out.println(converted);
    }
}
