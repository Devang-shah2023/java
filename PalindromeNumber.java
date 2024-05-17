import java.util.Scanner;
public class PalindromeNumber{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);

		System.out.println("Please enter a number");
		int number= scanner.nextInt();


        int c= number;
        int r=0, rev=0;

		while (number!=0) {
			rev= number%10;
			r= (r*10)+rev;
			number= number/10;


		}
		if (c==r) {
		System.out.println("Number is palindrome");
		
	} else{
		System.out.println("Number is not palindrome");
	}


System.out.println("Please enter a string");
 String str= scanner.next();

 int s=0, end=str.length()-1;

 while(s!= str.length()/2){
 	if(str.charAt(s)!= str.charAt(end)){
 		System.out.println("It is not palinmdrome");
 		break;
 	}
 else{
 	s++;
 	end--;
 
 System.out.println("It is Palindronme");
}
		

}
		
	}
}
