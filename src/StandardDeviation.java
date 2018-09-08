import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        float sum = 0.0f;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        float mean = sum / n;

        float difference = 0.0f;

        for(int i=0; i<n; i++){
            difference += Math.pow((a[i] - mean),2);
        }

        float sd = (float) Math.sqrt(difference / n); // standard deviation
        System.out.printf("%.1f", sd);
    }
}
