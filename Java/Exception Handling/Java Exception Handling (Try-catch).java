import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        try
            {
                int n = in.nextInt();
                int p = in.nextInt();
                System.out.println(n/p);
            }
            catch(InputMismatchException e)
            {
                System.out.println("java.util.InputMismatchException");
                in.nextLine();
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        in.close();
    }
}
