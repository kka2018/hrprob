package datastructures;

import java.util.Scanner;

public class SparseArrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(), q=scanner.nextInt();
        String[] strings = new String[n], queries = new String[q];

        // Enter space separated strings and queries values
        for(int i=0; i<strings.length; i++)
            strings[i] = scanner.next();

        for(int i=0; i<queries.length; i++)
            queries[i] = scanner.next();

        int[] result = matchingStrings(strings, queries);

        for(int i=0; i<result.length; i++)
            System.out.print( result[i] + " ");
        scanner.close();
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            result[i] = 0;
            for(int j=0; j<strings.length; j++){
                if(queries[i].equals(strings[j]))
                    result[i]++;
            }
        }
        return result;
    }
}