
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            
            String s = Integer.toString(n); // Convert int in String

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

