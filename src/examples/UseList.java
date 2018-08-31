package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseList {
    public static void main(String[] coo){
        Scanner scanner = new Scanner(System.in);

        List<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<3; i++)
            a.add(scanner.nextInt());

        List<Integer> b = new ArrayList<Integer>();
        for(int i=0; i<3; i++)
            b.add(scanner.nextInt());

        List<Integer> points = new ArrayList<Integer>();
        points.add(0);
        points.add(0);

        for(int i=0; i<3; i++){
            if(a.get(i)<b.get(i))
                points.set(1, points.get(1)+1);
            else if(a.get(i)>b.get(i))
                points.set(0, points.get(0)+1);
            else
                continue;
        }

        System.out.println(points);
        scanner.close();
    }
}
