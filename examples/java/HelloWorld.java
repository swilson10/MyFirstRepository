class HelloWorld {
	public static void main(String[] args ) {

			System.out.println("Hello World!");
	
if (args.length == 0)
    	{
        	System.out.println("Please provide your name");
    	}

else if (args.length >1)
	{
		System.out.println("I only want your first name");
	}
	
else	{
		System.out.println("Hello " + args[0]);	
	}

	}	
}


//1 arguments - throw message - hello + args
//2 arguemn		i only want your first name
//0 args 			pleas provide name




