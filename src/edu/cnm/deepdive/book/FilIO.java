package edu.cnm.deepdive.book;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Read file and display context.
 */
public class FilIO {
  public static void main(String[] args) {
    BufferedReader br = null;
    try
    {
      br = new BufferedReader(new FileReader("fileName.txt"));
      String line;

      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();

    } finally {
      try {
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

  }


}
