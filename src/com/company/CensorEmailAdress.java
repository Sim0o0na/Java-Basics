package com.company;

/**
 * Created by Simona Simeonova on 19-Dec-16.
 */
import java.util.Scanner;
public class CensorEmailAdress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputEmail = scan.nextLine();
        String inputText = scan.nextLine();
        String[] inputEmailArray = inputEmail.split("@");
        String username = inputEmailArray[0];
        String domain = inputEmailArray[1];
        if (inputText.toLowerCase().contains(inputEmail.toLowerCase())){
            //System.out.println("Sudurjam");
            StringBuilder MyUsername = new StringBuilder(username);
            for (int i =0; i<username.length(); i++){
                MyUsername.setCharAt(i, '*');
            }
            StringBuilder MyDomain = new StringBuilder(domain);
            for (int i =0; i<domain.length(); i++){
                MyDomain.setCharAt(i, '*');
            }
            String replacement = MyUsername+"@"+domain;
            String replacedStr = inputText.replaceAll(inputEmail, replacement);
            System.out.println(replacedStr);
        }
    }
}
