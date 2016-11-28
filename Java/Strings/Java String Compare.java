import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int B=sc.nextInt();
        
        ArrayList<String> ar = new ArrayList<String>();
        for (int i = 0; i <= A.length()-B; i++) {
        	String a = A.substring(i, i+B);
        	ar.add(a);         	        	
        }
        ar.sort(null);
        System.out.println(ar.get(0));
        System.out.println(ar.get(ar.size()-1));
    }
}
