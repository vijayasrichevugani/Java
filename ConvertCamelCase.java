class Main {
	public static void main(String[] args)
	{
	    String str = "Geeks for Geeks";
        char arr[] = str.toCharArray();
        if(Character.isLowerCase(arr[0])){
            arr[0] = Character.toUpperCase(arr[0]);
        }
        else{
            for(int i=1;i<arr.length;i++){
                if(arr[i] == ' '){
                    arr[i+1] = Character.toUpperCase(arr[i+1]);
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(String.valueOf(arr, 0, arr.length));
	}
}
