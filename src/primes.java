import java.util.Scanner;

public class primes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int count=0;
        int j=0;
        if(n==1)
            count = 0;
        else{
            for(int i=2; i<n; i++){
                for(j=2; j<i; j++){
                    if(i%j==0)
                        break;
                }
                if(j==i)
                    count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}
