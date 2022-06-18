import java.util.*;

public class Main
{
    public static void TwoSum_Hashset(int arr[], int n, int x){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<n;i++){
            int temp = x-arr[i];
            if (s.contains(temp)) {
                System.out.println("Pair with given sum "+ x + " is (" + arr[i]+ ", " + temp + ")");
                break;
            }
            s.add(arr[i]);
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
		
		System.out.println("Enter the expected sum");
		int x=sc.nextInt();
		TwoSum_Hashset(arr,n,x);
	
	}
}
