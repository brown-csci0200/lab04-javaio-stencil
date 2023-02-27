package sol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import sol.Cat;

public class CatTest {

  @Test
  public void testCat() {
    BufferedReader r2 = null;
    BufferedReader r3 = null;

    // TODO: change these to paths!
    String INFILE = "PATH TO SOME FILE A";
    String OUTFILE = "PATH TO A DIFFERENT, EMPTY FILE B";

    try (
            BufferedReader r1 =new BufferedReader(new FileReader(INFILE));
            BufferedWriter w1 = new BufferedWriter(new FileWriter(OUTFILE));
            ){


      Cat.cat(r1, w1);

      // set up readers for the two files
      r2 = new BufferedReader(new FileReader(INFILE));
      r3 = new BufferedReader(new FileReader(OUTFILE));

      String line1 = r2.readLine();
      String line2 = r3.readLine();

      // ensure every line is the same
      while (line1 != null && line2 != null) {
        Assert.assertEquals(line1, line2);

        line1 = r2.readLine();
        line2 = r3.readLine();
      }

      // ensure neither file had more lines than the other
      Assert.assertNull(line1);
      Assert.assertNull(line2);
    } catch (FileNotFoundException e) {
      System.out.println("DessertCase was not found!");
    } catch (IOException e) {
      System.out.println("There was an IO issue!");
    }
  }

}
