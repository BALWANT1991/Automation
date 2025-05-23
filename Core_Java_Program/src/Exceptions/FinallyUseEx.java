package Exceptions;

import java.io.*;

public class FinallyUseEx {

  public static void main(String[] args) {
    FileInputStream inputStream = null;
    try {
      // Open a file input stream
      inputStream = new FileInputStream("/Java/Java-Code/Exceptions/input.txt");

      int data = inputStream.read(); // Read from the file
      System.out.print((char) data);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    } finally {
      if (inputStream != null) {
        try {
          // Close the stream and release the resource
          inputStream.close();
          System.err.println("resource removed");
        } catch (IOException e) {
          System.err.println(e.getMessage());
        } // Output: aresource removed
      }
    }
  }
}
