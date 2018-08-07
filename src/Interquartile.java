import java.util.Arrays;
import java.util.Scanner;

public class Interquartile {

    public static float median(int[] a){
        Arrays.sort(a);
        float median = 0;
        if((a.length%2) == 0)
            median = (float) ((a[(a.length-1)/2] + a[((a.length-1)/2)+1])/2.0);
        else
            median = (float) a[(a.length-1)/2];
        return median;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] f = new int[n];

        int fsum = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
            fsum += f[i];
        }

        int[] a = new int[fsum];

        int k=0;

        for (int i = 0; i < a.length; ) {
            for(int j=0; j<f[k]; j++){
                a[i] = x[k];
                i++;
            }
            k++;
        }

        Arrays.sort(a);

        float q2 = median(a);
        int[] l = new int[a.length/2];
        int[] u = new int[a.length/2];

        for(int i=0; i<a.length/2; i++) {
            l[i] = a[i];
            if((a.length%2)==0)
                u[i] = a[(a.length/2)+i];
            else
                u[i] = a[(a.length/2)+1+i];
        }

        float q1 = median(l);
        float q3 = median(u);
        float iqr = q3 - q1; //Interquartile range

        System.out.printf("\n%.1f", iqr);

        sc.close();
    }
}
