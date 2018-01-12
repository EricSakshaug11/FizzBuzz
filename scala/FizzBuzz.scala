object FizzBuzz{
       def main (args: Array[String]){
       	   var x = 0;
	   for( x <- 1 until 100){
	   	if(x%5 == 0){
		       if(x%3 == 0){
		       	      println("FizzBuzz");
			}else{
				println("Buzz");
			}
		}else if(x%3 == 0){
		      println("Fizz");
		}else{
			println(x);
		}
	}
	}
}