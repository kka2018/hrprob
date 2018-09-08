import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {

    public static int median(int[] a){
        Arrays.sort(a);
        int median = 0;
        if((a.length%2) == 0)
            median = (a[(a.length-1)/2] + a[((a.length-1)/2)+1])/2;
        else
            median = a[(a.length-1)/2];
        return median;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<n; i++)
            System.out.print(a[i]+" ");

        int q2 = median(a);
        int[] l = new int[n/2];
        int[] u = new int[n/2];

        for(int i=0; i<n/2; i++) {
            l[i] = a[i];
            if((n%2)==0)
                u[i] = a[(n/2)+i];
            else
                u[i] = a[(n/2)+1+i];
        }

        int q1 = median(l);
        int q3 = median(u);

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}