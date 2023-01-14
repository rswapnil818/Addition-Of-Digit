package while_loop;

public class AdditionOfDigit {

	public static void main(String[] args) {
		
		int n=123;   //n=10
		int b;
		int sum=0;
		
//		while(n>0){
//		  b=n%10;
//		  sum=sum+b;
//		  n=n/10;
//		  
		
		while(n>0){             //123>0                    10>0
			b=n%12;             //b=123%12 (rem=25)        b=10/12  (rem=0.833)
		    sum=sum+b;          //sum=0+25
			n=n/12;             //10
		}
		System.out.println(sum);

	}

}
