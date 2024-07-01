
import java.util.Scanner;

public class Solution {

    public static boolean flag = true;
   
    public static Scanner scan = new Scanner(System.in);
    public static int B = scan.nextInt();
    public static int H = scan.nextInt();

    static {
        if(B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
       }
    }
}

