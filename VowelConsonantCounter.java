import java.util.Scanner;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter a line of text:");
        String input= scanner.nextLine();

        int vowel=0;
        int consonant=0;

        for(int i=0; i<input.length(); i++){
            char currentChar= input.charAt(i);

            if((currentChar>='a'&& currentChar<='z')||(currentChar>='A' && currentChar<='Z')){
                if(currentChar=='a'||currentChar=='e'||currentChar=='i'||currentChar=='o'||
                currentChar=='u'||currentChar=='A'||currentChar=='E'||currentChar=='I'||
                currentChar=='O'||currentChar=='U'){
                    vowel++;
                }else {
                    consonant++;
                }

            }
        }
        System.out.println("Number of Vowels:"+vowel);
        System.out.println("Number of consonants"+consonant);
    }

    
}
