package charactercounter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharacterOccurrenceCounter {

    public static void main( String[] args ) {
        char C;
        Map< Character, Integer > M = new HashMap<>();
        for( C = 'a'; C <='z'; C++ ) {
            M.put(C, 0);
        }
        try {
            File F = new File(args[0]);
            FileWriter FW = new FileWriter("/home/zadmin/ProjectJava/Assignment7/output.txt");  //path to the output.txt file containing the count of all the charcters present in "input.txt"
            Scanner input = new Scanner(F);
            while(input.hasNextLine()) {
                char[] c = input.nextLine().toLowerCase().toCharArray();
                for (Character ch : c) {
                    if (Character.isLetter(ch)) {
                        M.put(ch, M.get(ch) + 1);
                    }
                }
            }
            System.out.println("Updated output.txt.");
            FW.write(M.toString());
            FW.close();
        }
        catch (Exception E) {
            System.out.println("We got an exception to deal with:  " + E);  //will print the type of exception if occurred
            System.out.println();
        }
        System.out.println(M);
    }
}
