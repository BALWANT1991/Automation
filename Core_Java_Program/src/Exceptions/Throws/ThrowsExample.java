package Exceptions.Throws;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    public void readFile(String fileName) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(fileName);
        // Code to read file content
        reader.close();
    }

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();

        try {
            // This may throw FileNotFoundException or IOException
            example.readFile("nonexistent_file.txt"); 
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }
    }
}

