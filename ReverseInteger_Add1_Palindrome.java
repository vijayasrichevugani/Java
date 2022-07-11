class Main {
	public static void main(String[] args)
	{
	    String str = "120";
        int x = Integer.parseInt(str)+1;
        String s1 = String.valueOf(x);
        StringBuilder output = new StringBuilder(s1).reverse();
        if(String.valueOf(x).equals(output.toString())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
	}
}
