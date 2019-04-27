import java.util.*;
public class RemoveWhiteSpaces {    
    public static void main(String[] args) {    
        System.out.println("Enter String");  
        Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();     
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
}    
