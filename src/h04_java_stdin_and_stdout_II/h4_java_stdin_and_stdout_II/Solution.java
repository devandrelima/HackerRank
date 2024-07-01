package h4_java_stdin_and_stdout_II;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();                    
        double d = scan.nextDouble();
        scan.nextLine();                        // Reponsible for clearing the buffer
        String s = scan.nextLine();             // if don't clear the buffer, nextLine doens't work

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
