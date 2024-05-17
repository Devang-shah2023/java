import java.util.Scanner;
public class StringHalfPrinter 
{public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.print("Enter a string:");
    String input= scanner.nextLine();

    int length=input.length();

    if(length>1){
        int start= length/2;
        String SecondHalf= input.substring(start);

        System.out.println("Length of the string:"+length);
        System.out.println("Second half of the string:" +SecondHalf);
    } else{
        System.out.println("String is too short to have a second half.");
    }
}
    
}
