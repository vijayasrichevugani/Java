import java.util.*;
public class Main
{
    public static int findElement(int arr[],int n,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== key){
                return i;
            }
        }
        return -1;
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
		System.out.println("Enter element that you want to find");
		int key = sc.nextInt();
		int res = findElement(arr,n,key);
		
		System.out.println(res);
	}
}
