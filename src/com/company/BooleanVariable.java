package com.company;

import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Boolean boolean1 = Boolean.parseBoolean(input);
        if(boolean1==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
