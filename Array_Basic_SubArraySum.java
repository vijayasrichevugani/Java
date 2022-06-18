import java.util.*;

public class Main
{
    public static void SubArraySum_Basic(int arr[], int n, int sum){
        int curr_sum;
        for(int i=0;i<n;i++){
            curr_sum = arr[i];
            for(int j=i+1;j<=n;j++){
                if(curr_sum == sum){
                    int p = j-1;
                    System.out.println("Sum found between indexes "+i+" and "+p);
                    break;
                }
                if(curr_sum > sum || j==n){
                    break;
                }
                curr_sum = curr_sum+arr[j];
            }
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
	    System.out.println("Enter the sum");
	    int sum = sc.nextInt();
	    SubArraySum(arr,n,sum);
	}
}
