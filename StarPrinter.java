import java.util.*;
public class StarPrinter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number");
        int n= scanner.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
        
    
    for(int i=n-2; i>=0; i--){
        for(int j=0; j<=i; j++){
            System.out.print("*");
        }

        System.out.println();
    }
}
}
