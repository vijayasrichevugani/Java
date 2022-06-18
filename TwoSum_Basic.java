import java.util.*;
public class Main
{
    public static void TwoSumBasic(int arr[], int n, int x){
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int sum = arr[i]+arr[j];
                if(sum == x){
                    System.out.println("Pair with a given sum "+ x +" is ("+arr[i]+","+arr[j]+")");
                    System.out.println("Pair with a given sum exist.");
                    break;
                }
            }
        }
        System.out.println("Pair with given sum doesn't exist");
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
		
		System.out.println("Enter the expected sum");
		int x=sc.nextInt();
		TwoSumBasic(arr,n,x);
	
	}
}
