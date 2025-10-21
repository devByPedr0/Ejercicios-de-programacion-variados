import java.util.*;

public class amasb {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum[] = new int [n+1];

        for(int i=1;i<=n;i++){
            int a=sc.nextInt(),b=sc.nextInt();

            sum[i]=a+b;

        }

        for(int i=1;i<=n;i++){
            System.out.println(sum[i]);
        }

    }
}
