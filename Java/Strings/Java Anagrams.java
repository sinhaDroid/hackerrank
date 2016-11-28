import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String A, String B) {
        
        // Complete the function by writing your code here.
        String a=A.toLowerCase();
	    String b=B.toLowerCase();
	    boolean f = false;
	    char[] c = a.toCharArray();
	    Arrays.sort(c);
	    char[] d = b.toCharArray();
	    Arrays.sort(d);
	    a = new String (c);
        b = new String (d);
        if (a.equals(b)) {
            f=true;
        }
        return f;
        
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
