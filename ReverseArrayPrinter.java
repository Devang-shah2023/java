import java.util.Scanner;
public class ReverseArrayPrinter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size= scanner.nextInt();

        int[] numbers= new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element:"+(i+1)+":");
            numbers[i]= scanner.nextInt();
        }
        printArray(numbers, size);
    }

     static void printArray(int[] arr, int size){
    System.out.print("Array in Reverse Order:");
      for(int i= size-1; i>=0; i--){
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      }
    }
    

