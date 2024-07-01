
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
            
                System.out.printf("%-15s",s1); // I discover that printf formats the 15 spaces with this annotation
               // spaces(s1.length());
                System.out.printf("%03d\n",x);
            }
            System.out.println("================================");
    }

    /*
    public static void spaces(int stringLength){     // Responsible for skipping exactly 15 spaces between the string and the int
        int size = 15 - stringLength;

        while(size > 0){
            System.out.print(' ');
            size--;
        }
    }
     */
}