import java.util.*;

public class clases {
    public static class Persona{
        String nombre;
        int edad;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        Persona p1=new Persona();

        p1.edad=sc.nextInt();
    }
}
