import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        float sum = 0.0f;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        float mean = sum / n;
        System.out.printf("%.1f\n", mean);

        Arrays.sort(a);
        float median = 0.0f;
        if((n%2) == 0)
            median = (float) ((a[(n-1)/2] + a[((n-1)/2)+1])/2.0);

        else
            median = a[n/2];


        System.out.printf("%.1f\n", median);



        int[] counts = new int[n];
        int[] elements = new int[n];

        int j=0, count=1;

        elements[j] = a[0];
        counts[j] = count;

        for(int i=1; i<n; i++){
            if(a[i]==a[i-1]) {
                count++;
                counts[j] = count;
            }
            else{
                elements[j+1] = a[i];
                count = 1;
                counts[j+1] = count;
                j++;
            }
        }

        int mode = elements[maxIndex(counts)];

        System.out.println(mode);
    }

    public static int maxIndex(int[] a){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i<a.length; i++){
            if(max<a[i]) {
                max = a[i];
                index = i;
            }
        }

        return index;
    }
}