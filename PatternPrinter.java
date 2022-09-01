package assignment;
import java.util.Scanner;
public class PatternPrinter {
	public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in); 
		 int n = sc .nextInt(); 
		 patternPrinter(n); 
		 } 
		 static void patternPrinter(int n) { 
		 
			 for(int i=n;i>=1; i--) {
				 for(int j=n; j>=1; j--) {
					 for(int k=1;k>=1;k--)
					 {
						 System.out.println(j + " ");
					 }
				 }
				 System.out.println();
		 } 
		} 

}
