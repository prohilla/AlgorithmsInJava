package recursion;

public class Factorial {

	public static void main(String[] args){
		
		System.out.println(calculateFactorial(6));
	}

	public static int calculateFactorial(int i) {
		
		if(i==0){
			return 1;
		}
		else{
			return i * calculateFactorial(i-1);
		}
	}
}
