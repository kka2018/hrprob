package datastructures;

import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt(), m=scanner.nextInt();

        int[][] queries = new int[m][3];

        for(int i=0; i<m; i++){
            for(int j=0; j<3; j++)
                queries[i][j] = scanner.nextInt();
        }

        long result = arrayManipulation(n, queries);
        System.out.print(result);
        scanner.close();
    }

    public static long arrayManipulation(int n, int[][] queries) {
        long[] zeroArray = new long[n];

        for(int i=0; i<n; i++)
            zeroArray[i] = 0;

        long max=0l;

        for(int i=0; i<queries.length; i++){
            for(int j=queries[i][0]; j<=queries[i][1]; j++){
                zeroArray[j-1]+=queries[i][2];
                if(max<zeroArray[j-1])
                    max = zeroArray[j-1];
            }
        }
        return max;
    }

}
