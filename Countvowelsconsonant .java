import java.util.*;
public class Countvowelsconsonant  
{  
    public static void main(String[] args) {  
	System.out.println("Enter String");  
        Scanner sc=new Scanner(System.in);
	String string=sc.nextLine(); 
	int vcount=0;
	int ccount=0;

	string = string.toLowerCase();   
	
	for(int i = 0; i < string.length(); i++)
	{
		if(string.charAt(i)=='a'|| string.charAt(i) == 'e'|| stingr.charAt(i) == 'i'|| string.charAt(i) == 'o'|| str.charAt(i) == 'u') 

		{
			vcount++;
		}
		else if(string.charAt(i) >= 'a' && string.charAt(i)<='z')
	        {      
                cCount++;    
 		} 
	}
	
	System.out.println("Number of vowels: " + vcount);    
        System.out.println("Number of consonants: " + ccount);    
}
}
