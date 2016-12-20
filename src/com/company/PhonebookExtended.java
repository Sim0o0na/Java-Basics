package com.company;

/**
 * Created by Simona Simeonova on 19-Dec-16.
 */
import java.util.*;
public class PhonebookExtended {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        Map<String, String> phonebook = new LinkedHashMap<String, String>();
        while (!command.equals("END")){
            String[] commandArray = command.split(" ");
            if (commandArray[0].equals("A")){
                phonebook.put(commandArray[1], commandArray[2]);
            }
            if (commandArray[0].equals("S")){
                if (phonebook.containsKey(commandArray[1])){
//                    for (String key : phonebook.keySet()) {
                    String key = commandArray[1];
                    System.out.println(key + " -> " + phonebook.get(key));

                }
                else {
                    System.out.println("Contact " + commandArray[1] +" does not exist." );
                }
            }
            if (commandArray[0].equals("ListAll")){
                Map<String, String> treeMap = new TreeMap<String, String>(phonebook);
                printMap(treeMap);
            }
            command = scan.nextLine();
        }
    }
    public static void printMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println( entry.getKey()
                    + " -> " + entry.getValue());
        }
    }
}
