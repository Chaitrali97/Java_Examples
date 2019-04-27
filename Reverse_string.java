import java.util.*;
public class Reverse_string
{
	public static void main(String[] args) {  
	System.out.println("Enter String");  
        Scanner sc=new Scanner(System.in);
	String string=sc.nextLine(); 

	String revstr="";

	for(int i = string.length()-1; i >= 0; i--)
	{
		revstr = revstr + string.charAt(i);    

	}    
	  System.out.println("Original string: " + string);    
	  System.out.println("Reverse of given string: " + revstr);  

	if(string.equals(revstr))
	{
	  System.out.println("palindrome");	
	}  
	else
	{
	  System.out.println(" not palindrome");	
	}



}
}
