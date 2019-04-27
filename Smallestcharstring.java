import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Smallestcharstring {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        char c='x';
        
       for(int i = 0;i<str.length();i++)
       {
          
               if(i == 0)
               {
                   c = str.charAt(i);
               }
               else
               {
                   if(c>str.charAt(i))
                       c = str.charAt(i);
               }
           
       }
        
        System.out.println(c);
    }
}
