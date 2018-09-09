package javabasics;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = a;
                for(int k=0; k<=j; k++){
                    arr[j] += (int)Math.pow(2,k) * b;
                }
            }

            for(int l=0; l<n; l++)
                System.out.print(arr[l] + " ");
        }
        in.close();
    }
}
