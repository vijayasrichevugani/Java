/*Find the element which is repeated more than half the length of an array*/
import java.util.*;

public class Main
{
    public static void MajorityElement(int arr[], int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int count =0;
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]) +1;
                if (count > arr.length /2){
                    System.out.println("Majority element is " + arr[i]);
                }
                else{
                    map.put(arr[i], count);
                }
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println("No Majority Element");
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
	    MajorityElement(arr,n);
	}
}
