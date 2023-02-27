package sol;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Doc {

    /**
     * Reads from console until EOF, then writes all lines to writer.
     *
     * @param writer - a BufferedWriter writing to a file.
     */
    public static void toDocument(BufferedWriter writer) throws IOException {
        // TODO: read input from the command line and write to writer!
        // hint: you will have to first create a BufferedReader!
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: <output file>");
            System.exit(0);
        }

        // TODO: make a call to the static 'toDocument' method, giving it the proper argument!
    }

}
