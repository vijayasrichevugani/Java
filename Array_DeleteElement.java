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
    public static int deleteElement(int arr[],int n,int key){
        int pos = findElement(arr,n,key);
		if(pos == -1){
		    System.out.println("Element doesn't exist");
		    return -1;
		}
		else{
		    int i;
            for (i = pos; i< n - 1; i++)
                arr[i] = arr[i + 1];
            return n - 1;
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
		System.out.println("Enter element that you want to delete");
		int key = sc.nextInt();
		n = deleteElement(arr,n,key);
		
		
		System.out.println("After deleting the Element");
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		    
		}
	}
}
