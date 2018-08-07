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
        if((n/2) == 0)
            median = (float) ((a[(n-1)/2] + a[((n-1)/2)+1])/2.0);
        else
            median = a[n/2];
        System.out.printf("%.1f\n", median);

        int mode = a[0];
        int count1 = 1, count2 = 1;
        for(int i=1; i<n; i++){
            if(a[i]<=a[i-1]) {
                count1++;
                if(count1>count2)
                    mode = a[i];
            }
            else
            {
                count2 = count1;
                count1 = 1;
                continue;
            }
        }

        System.out.println(mode);
    }
}