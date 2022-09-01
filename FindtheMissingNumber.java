package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindtheMissingNumber {

	 public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in); 
		 int size = sc .nextInt(); 
		 int[] arr = new int[size - 1]; 
		 for (int i = 0; i < size - 1; i++) 
			 arr[i] = sc.nextInt(); 
		 System.out.println(missingNumberFinder(arr, size)); 
		 } 
		 static int missingNumberFinder(int array[], int n) { 
			 Set<Integer> set=new HashSet<>();
			
			 
			 for(int i :array) {
				 set.add(i);
				 
		 } 
			 for(int i=1;i<=n;i++)
			 {
				 if(!set.contains(i))
					 return i;
			 }
			 return 0;
		} 

}
