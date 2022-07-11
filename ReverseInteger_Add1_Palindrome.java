class Main {
	public static void main(String[] args)
	{
	    	String str = "120";
		int x = Integer.parseInt(str)+1;
		StringBuilder output = new StringBuilder(String.valueOf(x));
		if(output.toString().equals(output.reverse().toString())){
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}
	}
}
