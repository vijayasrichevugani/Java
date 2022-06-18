/* Given an array of integers, print the array in such a way that the first element is first maximum and second element is first minimum and so on.*/
/*Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
Output : 7 1 6 2 5 3 4

Input : arr[] = {1, 6, 9, 4, 3, 7, 8, 2}
Output : 9 1 8 2 7 3 6 4*/

import java.util.*;

public class Main
{
    public static void AlternativeSorting(int arr[], int n){
        Arrays.sort(arr);
        int j =n-1; 
        int i=0;
        while(i<j){
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
        }
        if(n%2 !=0){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Length of array");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<arr.length;i++){
	        System.out.println("Enter an array element");
	        arr[i] = sc.nextInt();
	    }
	    
	    AlternativeSorting(arr,n);
	}
}
