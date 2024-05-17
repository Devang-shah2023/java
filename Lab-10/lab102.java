import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab102 {
    public static void main(String[] args) {
        String inputFile = "abc.txt"; // Input file name
        String outputFile = "xyz.txt"; // Output file name
        String wordToReplace = "hello";
        String replacementWord = "hello world";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            int replacements = 0;

            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(wordToReplace, replacementWord);
                writer.write(line + "\n");

                replacements += countOccurrences(line, replacementWord);
            }

            reader.close();
            writer.close();

            System.out.println("Number of replacements: " + replacements);
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e);
        }
    }

    private static int countOccurrences(String line, String word) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = line.indexOf(word, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }

        return count;
    }
}
