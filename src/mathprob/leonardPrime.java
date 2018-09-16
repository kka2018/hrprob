package mathprob;

import java.io.*;
import java.math.BigInteger;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class leonardPrime {

    /*
     * Complete the primeCount function below.
     */
    static int primeCount(long n) {
        /*
         * Write your code here.
         */
        long[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59};
      //  long productPrime = 2;
        BigInteger productPrime = new BigInteger("2");
        int count = 0;
        int i=0;
        while(productPrime.compareTo(BigInteger.valueOf(n))<=0){
            count++;
            productPrime = productPrime.multiply(BigInteger.valueOf(prime[i+1]));
            i++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            long n = scanner.nextLong();

            int result = primeCount(n);

            System.out.println(result);
        }

    }
}
