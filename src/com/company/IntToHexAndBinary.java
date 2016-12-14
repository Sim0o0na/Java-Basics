package com.company;
import java.util.Scanner;


public class IntToHexAndBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String convertedHex = decimal2hex(number);
        System.out.println(convertedHex);
        System.out.println(binaryform(number));
    }
    public static String decimal2hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d <= 0) return "0";
        int base = 16;   // flexible to change in any base under 16
        String hex = "";
        while (d > 0) {
            int digit = d % base;              // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / base;
        }
        return hex;
    }
    private static Object binaryform(int number) {
        int remainder;

        if (number <=1) {
            System.out.print(number);
            return null;   // KICK OUT OF THE RECURSION
        }

        remainder= number %2;
        binaryform(number >> 1);
        System.out.print(remainder);
        {
            return " ";
        }
    }
}