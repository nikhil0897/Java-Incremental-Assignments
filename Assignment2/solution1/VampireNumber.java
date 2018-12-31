package solution1;

import java.util.Arrays;
import java.util.TreeSet;

public class VampireNumber {
    private static int length( long vampN ) {

        return Long.toString(vampN).length();
    }

    private static boolean Check( long vampN, long vampN1, long vampN2 ) {	//boolean method to check whether the numbers passed will make a perfect fang for the vampire number or not

        if( Long.toString(vampN1).endsWith("0") && Long.toString(vampN2).endsWith("0") )
            return false;

        int vampNLen = length(vampN);
        if( length(vampN1) != vampNLen / 2 || length(vampN2) != vampNLen / 2)
            return false;

        char[] vampNum = Long.toString(vampN).toCharArray();
        char[] vampNum2 = (Long.toString(vampN1) + Long.toString(vampN2)).toCharArray();

        Arrays.sort(vampNum);
        Arrays.sort(vampNum2);
        return Arrays.equals(vampNum, vampNum2);
    }

    public static void main(String[] args) {

        TreeSet<Long> vamps = new TreeSet<>();
        for (long num = 10; vamps.size() <= 100; num++) {
            if ((length(num) % 2) != 0) {
                num = num * 10 - 1;
                continue;
            }
            for ( long vampN1 = 2; vampN1 <= Math.sqrt(num) + 1; vampN1++ ) {
                if ( num % vampN1 == 0 ) {
                    long vampN2 = num / vampN1;
                    if ( Check( num, vampN1, vampN2) && vampN1 <= vampN2 ) {
                        vamps.add(num);

                    }
                }
            }
        }
        for(long l:vamps){
            System.out.println(l);
        }
    }
}
