import java.util.*;

public class Bellotas {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(),sum=0;

        for(int i=1;i<=n;i++){
            int a=sc.nextInt();

            if(a>10) sum+=a-10;
        }
        
        System.out.println(sum);

    }
}
