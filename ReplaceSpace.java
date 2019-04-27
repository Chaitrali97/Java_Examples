import java.util.*;
public class ReplaceSpace    
{    
    public static void main(String[] args) {    
        System.out.println("Enter String");  
        Scanner sc=new Scanner(System.in);
	String string=sc.nextLine(); 
	System.out.println("Enter character to replace");  
	 Scanner sc=new Scanner(System.in);   
        char ch = sc.nextChar();  
            
          
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}      
