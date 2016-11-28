import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;
class Volume{ 
	int get_volume(int a){return a*a*a;}
	int get_volume(int a,int b,int c){return a*b*c;}
	double get_volume(double a){return Math.PI*a*a*a*2/3;}
	double get_volume(double a,double b){return b*Math.PI*a*a;}
} 
class Display{ 
	void display(double x){System.out.printf("%.3f\n",x);}
} 

class Calculate {
    Scanner cin;
	Display output;
	Calculate() throws IOException{cin=new Scanner(System.in);output=new Display();if(cin==null)throw new IOException("dummy");}
	int get_int_val(){int x=cin.nextInt();if(x<=0)throw new NumberFormatException("All the values must be positive");return x;}
	double get_double_val(){double x=cin.nextDouble();if(x<=0)throw new NumberFormatException("All the values must be positive");return x;}
	static Volume do_calc(){return new Volume();} 
}
public class Solution {

 public static void main(String[] args) {
   DoNotTerminate.forbidExit();
   try {
    Calculate cal = new Calculate();
    int T = cal.get_int_val();
    while (T--> 0) {
     double volume = 0.0;
     int ch = cal.get_int_val();
     if (ch == 1) {
      int a = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(a);
     } else if (ch == 2) {
      int l = cal.get_int_val();
      int b = cal.get_int_val();
      int h = cal.get_int_val();
      volume = Calculate.do_calc().get_volume(l, b, h);

     } else if (ch == 3) {
      double r = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r);

     } else if (ch == 4) {
      double r = cal.get_double_val();
      double h = cal.get_double_val();
      volume = Calculate.do_calc().get_volume(r, h);

     }
     cal.output.display(volume);
    }

   } catch (NumberFormatException e) {
    System.out.print(e);
   } catch (IOException e) {
    e.printStackTrace();
   } catch (DoNotTerminate.ExitTrappedException e) {
    System.out.println("Unsuccessful Termination!!");
   }


  } //end of main
} //end of Solution

/**
 *This class prevents the user form using System.exit(0)
 * from terminating the program abnormally.
 *
 */
class DoNotTerminate {

 public static class ExitTrappedException extends SecurityException {}

 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
} //end of Do_Not_Terminate

