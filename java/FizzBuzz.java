public class FizzBuzz{

    //How many iterations of fizzbuzz the program should run
    private static int length;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";
    
    public static void main(String[] args){
	if(args.length > 0){
	    try{
		//Set the length of the runtime to an integer argument
		length = Integer.parseInt(args[0]);
	    }catch(NumberFormatException e){
		//If the user does not insert a valid integer, the program
		//defaults to 100.
		System.out.print("Invalid argument. Expected an integer, got: ");
		System.out.println(args[0]);
		System.out.println("Defaulting to a count of 100.");
		length = 100;
	    }
	}else{
	    length = 100;
	}
	//runs the fizzbuzz code
	for(int i = 1 ; i <= length ; i++){
	    String toPrint = i%3 == 0 ? (i%5==0 ? FIZZBUZZ : FIZZ) : ( i%5 == 0 ? BUZZ : new Integer(i).toString());
	    System.out.println(toPrint);
	}
    }
}
