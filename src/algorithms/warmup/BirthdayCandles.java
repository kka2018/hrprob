package algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCandles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = scanner.nextInt();

        Arrays.sort(ar);
        int countTallest=1;
        int arLength=ar.length;
        for(int i=arLength-1; i>0; i--){
            if(ar[i]==ar[i-1])
                countTallest++;
            else
                break;
        }
        System.out.print(countTallest);
        scanner.close();
    }
}
