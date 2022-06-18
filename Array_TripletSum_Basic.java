import java.util.*;

public class Main
{
    public static boolean TripletSum_Basic(int arr[], int n, int x){
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = arr[i]+arr[j]+arr[k];
                    if(sum == x){
                        System.out.println("Triplet Sum Matched with pair ("+arr[i]+","+arr[j]+","+arr[k]+")");
                        return true;
                    }
                }
            }
        }
        System.out.println("Triplet Sum not found");
        return false;
        
        
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
		TripletSum_Basic(arr,n,x);
	
	}
}
