import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j=1;j<=n;j++)  {
                int x = 0;
                for (int k=0;k<j;k++)  {
                    x += Math.pow(2,k) * b;
                }
			    System.out.print(a+x+" ");
		    }
		    System.out.println();
        }
        in.close();
    }
}
