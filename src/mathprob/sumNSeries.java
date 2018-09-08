package mathprob;

import java.util.Scanner;

public class sumNSeries {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int result = summingSeries(n);
        System.out.print(result);
        scanner.close();
    }

    static int summingSeries(long n) {

        double sum = 0;
        for(long i=1; i<=n; i++){
            sum = sum + (2 * i - 1); //nth term expression can be reduced.
        }

        return (int)(sum % 1000000001);
    }
}
