package assignment;
import java.util.Scanner;
public class FirstLetterPrinter {
	public static void main(String[] args)
	
	{
	 Scanner in = new Scanner(System.in); 
	 String input = in .nextLine(); 
	 System.out.println(firstLetterPrinter(input)); 
	 } 
	 static String firstLetterPrinter(String str) { 
	   String result="";
	   String[] strArray=str.split("");
	   for(String s:strArray) {
		   if(s.length() !=0 && Character.isLetter(s.charAt(0)));
		   {
		   result +=s.charAt(0);
	   }
	   }
	 return result;
	

	 }
}