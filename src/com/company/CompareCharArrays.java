package Part2;

import java.util.Arrays;
import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        String[] array1 = input1.split(" ");
        String[] array2 = input2.split(" ");
        int l1 = array1.length;
        int l2 = array2.length;
        boolean blnResult = Arrays.equals(array1,array2);
        if (blnResult == true){
            System.out.println(String.join("",array1));
            System.out.println(String.join("",array2));
        }
        else if (l1<l2){
            System.out.println(String.join("",array1));
            System.out.println(String.join("",array2));
        }
        else if (l1>l2){
            System.out.println(String.join("",array2));
            System.out.println(String.join("",array1));
        }
        else
        {
            System.out.println(String.join("",array1));
            System.out.println(String.join("",array2));
        }
    }
}