package com.company;

/**
 * Created by Simona Simeonova on 19-Dec-16.
 */
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] phrases = { "Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = { "Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!" };
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            System.out.println((phrases[random.nextInt(6)] + events[random.nextInt(6)] +
                    author[random.nextInt(6)] + " - " +
                    city[random.nextInt(6)]));
        }
    }
}