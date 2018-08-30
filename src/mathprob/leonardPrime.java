package mathprob;

import java.util.Scanner;

public class leonardPrime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int result = primeCount(n);
        System.out.print(result);
        scanner.close();
    }


    static int primeCount(long n) {

        int count = 0;
        long product = 1;
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        for(int i=0; i<prime.length; i++){
            product *= prime[i];
            if(product<=n)
                count++;
            else
                break;
        }
        return count;
    }
}
