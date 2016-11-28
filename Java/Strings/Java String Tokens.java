import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        // Write your code here.
        s = s.trim();
        if (s.isEmpty()) {
        	System.out.println(0);
        } else {
            String []A = s.split("'+( +|)| +|!+( +|)|,+( +|)|_+( +|)|@+( +|)|\\.+( +|)|\\?+( +|)|\\\\+( +|)");
            System.out.println(A.length);
            
            for (int i = 0; i < A.length; i++) {
                System.out.println(A[i]);
		    }
        }
    }
}
