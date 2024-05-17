import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lab101 {
    public static void main(String[] args) {
        String filename = "abc.txt"; // Change this to your file name
        
        try {
            File file = new File(filename);
            
            if (!file.exists()) {
                throw new FileNotFoundException("File '" + filename + "' does not exist.");
            }
            
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            
            bufferedReader.close();
            fileReader.close();
            
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e);
        }
    }
}
