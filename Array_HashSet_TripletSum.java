import java.util.*;

public class Main
{
    public static boolean TripletSum_HashSet(int arr[], int n, int x){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            int sum = x-arr[i];
            for(int j=i+1;j<n;j++){
                if(s.contains(sum-arr[j])){
                    System.out.println("Triplet Sum Matched with pair ("+arr[i]+","+arr[j]+","+(sum-arr[j])+")");
                    return true;
                }
                s.add(arr[j]);
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
		TripletSum_HashSet(arr,n,x);
	
	}
}
