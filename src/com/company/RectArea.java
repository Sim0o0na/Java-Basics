package com.company;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double area = num1*num2;
        System.out.println(area);
    }
}
