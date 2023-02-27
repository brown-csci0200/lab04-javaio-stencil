package sol;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Cat {

    /**
     * Reads from a file using a BufferedReader and writes the contents to a 
     * second file using a BufferedWriter.
     *
     * @param reader - a buffered reader for the file
     * @param writer - a buffered writer to write to
     */
    public static void cat(BufferedReader reader, BufferedWriter writer) throws IOException {
        // TODO: read and write lines until EOF is reached!
    }

    public static void main(String[] args) throws IOException{
        if (args.length != 2) {
            System.out.println("Usage: <input file> <output file>");
            System.exit(0);
        }

        // TODO: call the 'cat' method, constructing the appropriate arguments!
    }
}
