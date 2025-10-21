import java.util.Scanner;

public class practica1 {
    static int suma(int a, int b){
        return a + b;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int a,b;

        a= sc.nextInt();
        b= sc.nextInt();

        System.out.println(suma(a,b));
    }


}
