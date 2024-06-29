package h2_if_else;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N < 2){
            write(N);
        } else if(N <= 5){
             write(N);
        } else if(N <= 20){
            if(N%2 == 0){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }
        } else{ 
            write(N);
        }

        scanner.close();
    }

    public static void write(int N){
        if(N%2 == 1){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }
    }
}

