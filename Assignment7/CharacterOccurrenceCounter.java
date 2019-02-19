import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Nikhil Sharma
 */

public class CharacterOccurrenceCounter {
    public static void main(String args[]) throws FileNotFoundException, IOException { // throwing
                                                                                       // FileNotFoundException,
                                                                                       // IOException exceptions
        char fetch;
        Integer frequencyCounter;
        Map<Character, Integer> dictionary = new TreeMap<>();
        FileReader readFile = new FileReader(args[0]);
        int iterator;
        while ((iterator = readFile.read()) != -1) {
            fetch = (char) iterator;
            frequencyCounter = dictionary.get(fetch);
            dictionary.put(fetch, (frequencyCounter == null) ? 1 : frequencyCounter + 1); // increasing the frequency of the encountered character
        }
        readFile.close(); // closing the opened input.txt file

        System.out.println("Saved the count of each character inside the input.txt to 'output.txt'.");

        FileWriter writeFile = new FileWriter("output.txt"); // creating new file to store the output
        writeFile.write(dictionary.toString()); // converting TreeMap to string and storing inside "output.txt"
        writeFile.close(); // closing the file
        System.out.println(dictionary);
    }
}

/** First count in the output.txt file is the count for the number of lines in the input.txt file
 *  Second count is for number os spaces in the input.txt file
 *  And after that a few following counts are for special characters which are present inside the input.txt file
 *  I am specifying this here because I couldn't manipulate it inside the output.txt file.
 */
