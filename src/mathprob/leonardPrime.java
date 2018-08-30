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
        for(int i=2; i<=n; i++){
            boolean isprime = ifPrime(i);
            if(isprime==true){
                product *= i;
                if(product<=n)
                    count++;
                else
                    break;
            }
        }

        return count;
    }

    public static boolean ifPrime(long n){
        int i;
        boolean isprime = false;
        for(i=2; i<=n/2; i++){
            if(n%i == 0)
                break;
        }
        if(i == (n/2+1))
            isprime = true;
        return isprime;
    }
}
