/*Find the elements that are unique or not repeated in the Array*/
import java.util.*;
public class Main
{
    public static ArrayList<Integer> FindNonRepeatedElement(int arr[],int n){
        HashMap<Integer, Integer> m = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(!m.containsKey(arr[i])){
                m.put(arr[i],1);
            }
            else{
                int s = m.get(arr[i]);
                m.put(arr[i],s+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(m.get(arr[i]) == 1){
                list.add(arr[i]);
            }
        }
        return list;
        
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
		
		
		System.out.println(FindNonRepeatedElement(arr,n));
	
	}
}
