package vampirenumber;

import java.util.Arrays;
import java.util.TreeSet;

/*
 * @author Nikhil Sharma
 */

public class VampireNumber {
    /*
     * @param long numberLength
     * Method returns the length of the number that is passes in it as parameter
     */
    private static int getLength( long numberLength ) {
        return Long.toString(numberLength).length();
    }

    /*
     * @param long vampireNumberCheck, long firstFactor, long secondFactor
     * First one was iterated via for loop, second and third parameters are the factors of the number
     */
    private static boolean checkNumber( long vampireNumberCheck, long firstFactor, long secondFactor ) {    //boolean method to check whether the numbers passed will make a perfect fang for the vampire number or not

        if( Long.toString(firstFactor).endsWith("0") && Long.toString(secondFactor).endsWith("0") )
            return false;

        int vampireNumberLength = getLength(vampireNumberCheck);
        if( getLength(firstFactor) != vampireNumberLength / 2 || getLength(secondFactor) != vampireNumberLength / 2)
            return false;

        char[] firstFang = Long.toString(vampireNumberCheck).toCharArray();
        char[] secondFang = ((firstFactor) + Long.toString(secondFactor)).toCharArray();

        Arrays.sort(firstFang);
        Arrays.sort(secondFang);
        return Arrays.equals(firstFang, secondFang);
    }

    public static void main(String[] args) {

        TreeSet<Long> vampireNumber = new TreeSet<>();
        for (long vampireCheck = 10; vampireNumber.size() < 100; vampireCheck++) {
            if ((getLength(vampireCheck) % 2) != 0) {
                vampireCheck = vampireCheck * 10 - 1;
                continue;
            }
            for ( long firstNaturalNumber = 2; firstNaturalNumber <= Math.sqrt(vampireCheck) + 1; firstNaturalNumber++ ) {
                if ( vampireCheck % firstNaturalNumber == 0 ) {
                    long secondNaturalNumber = vampireCheck / firstNaturalNumber;
                    if ( checkNumber( vampireCheck, firstNaturalNumber, secondNaturalNumber) && firstNaturalNumber <= secondNaturalNumber ) {
                        vampireNumber.add(vampireCheck);

                    }
                }
            }
        }
        int serialNumber = 1;
        for(long l:vampireNumber){
            System.out.println(serialNumber + "." + l);
            serialNumber++;
        }
    }
}