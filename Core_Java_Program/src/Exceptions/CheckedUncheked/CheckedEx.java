package Exceptions.CheckedUncheked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedEx {

  public static void main(String[] args) {
    FileInputStream fis = null;

    // Checked Error: FileNotFoundException
    // Identified at compile time
    fis = new FileInputStream("nonexistentfile.txt");
    int data = fis.read(); // Read data from file
    System.out.println(data);
    fis.close(); // Close file stream
  }
}

