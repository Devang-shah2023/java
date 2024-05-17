import java.util.Scanner;
public class VowelCounter {

    public static String vowels = "aeiou";
    public static int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, total=0;
    public static int totalVowels = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0,e=0,i=0,o=0,u=0;

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String sentence = scanner.nextLine().toLowerCase();

            if (sentence.equals("quit")) {
                break;
            }

            for (char c : sentence.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    switch (c) {
                        case 'a':
                            aCount++;
                            break;
                        case 'e':
                            eCount++;
                            break;
                        case 'i':
                            iCount++;
                            break;
                        case 'o':
                            oCount++;
                            break;
                        case 'u':
                            uCount++;
                            break;
                    }
                    totalVowels++; 
                }
            }

            System.out.println("Individual vowel counts:");
            System.out.println("a: " + aCount);
            System.out.println("e: " + eCount);
            System.out.println("i: " + iCount);
            System.out.println("o: " + oCount);
            System.out.println("u: " + uCount);
            System.out.println("Total vowels: " + totalVowels); 

            a+=aCount;
            e+=eCount;
            i+=iCount;
            o+=oCount;
            u+=uCount;
            total+=totalVowels;

        }

        System.out.println("\nProgram terminated. Total vowel counts:");
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
        System.out.println("Total vowels: " + total); 
    
}
}