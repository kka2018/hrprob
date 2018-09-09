package javabasics;

import java.util.Scanner;

public class StdInOut2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double y=sc.nextDouble();
/*
        If you use the nextLine() method immediately following the nextInt() method,
        recall that nextInt() reads integer tokens; because of this,
        the last newline character for that line of integer input is
        still queued in the input buffer and the next nextLine() will
        be reading the remainder of the integer line (which is empty).
*/
        sc.nextLine(); // To avoid the empty line left after nextDouble
        String s=sc.nextLine();


        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}
