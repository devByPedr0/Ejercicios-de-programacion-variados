import java.util.*;
import java.io.*;

public class project2 {

    public static class data{
        String in;
        String name;
        String type;
        int cost;
        String dept;
    }

    static void menu(){

        System.out.println("Menu:");
        System.out.println("1- Insertar, Modificar or Eliminar datos");
        System.out.println("2- Comprobar AFT o MU");
        System.out.println("3- AFT %");
        System.out.println("4- Comprobar precio AFT o numero de departamento de MU");
        System.out.println("5- Promedio de costo de AFT");
        System.out.println("6- Buscar MU por costo");
        System.out.println("7- Generar fichero");
        System.out.println("0- Terminar");
    }

    static void submenu(){

        System.out.println("1- Insertar");
        System.out.println("2- Modificar");
        System.out.println("3- Eliminar");

    }

    static data insertar(){
        Scanner sc=new Scanner(System.in);
        data x=new data();

        System.out.println("Numero de Inventario: ");
        x.in= sc.nextLine().trim();
        System.out.println("Nombre: ");
        x.name=sc.nextLine().trim();
        System.out.println("Tipo de Medio (AFT/MU): ");
        x.type=sc.next().trim();
        System.out.println("Costo: ");
        x.cost=sc.nextInt();
        sc.nextLine();
        System.out.println("Departamento: ");
        x.dept=sc.nextLine().trim();

        return x;

    }

    static void show(data x){

        System.out.println("Numero de Inventario: " + x.in +
                            "|| Nombre: " + x.name +
                            "|| Tipo de Medio: " + x.type +
                            "|| Costo: " + x.cost +
                            "|| Departamento: " + x.dept);

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        ArrayList<data> lista=new ArrayList<>();

        int option1=1,option2;

        while(option1 !=0){

            menu(); option1=sc.nextInt();

            if(option1==1){

                submenu(); option2=sc.nextInt();

                if(option2==1){

                    lista.add(insertar());

                }
                if(option2==2){
                    int option3,sum=0;

                    System.out.println("# dato a modificar: ");

                    for(data x : lista){
                        sum++;
                        System.out.println(sum + "- ");

                        show(x);

                    }

                    option3=sc.nextInt();


                    lista.set(option3,insertar());

                }
                if(option2==3){
                    int option3,sum=0;

                    System.out.println("# dato a eliminar: ");

                    for(data x : lista){
                        sum++;
                        System.out.println(sum + "- ");

                        show(x);

                    }

                    option3=sc.nextInt();

                    lista.remove(option3);

                }

            }
            if(option1==2){
                String s;

                System.out.println("Numero de Inventario: ");
                sc.nextLine();
                s=sc.nextLine().trim();

                for(data x : lista){
                    if(x.in.equals(s)) System.out.println("Es " + x.type);
                }

            }
            if(option1==3){
                int sum=0,t=lista.size();
                float p;
                for(data x : lista){
                    if(x.type.equals("AFT")) sum++;
                }

                p=(100*sum)/t;
                System.out.println("Los AFT representan el " + p + "% del total" );
            }
            if(option1==4){
                String s;

                System.out.println("Numero de Inventario: ");
                sc.nextLine();
                s=sc.nextLine().trim();

                for(data x : lista){
                    if(x.in.equals(s) && x.type.equals("AFT")) System.out.println("Costo: " + x.cost);

                    else if(x.in.equals(s) && x.type.equals("MU")) System.out.println("Departamento: " + x.dept);
                }
            }
            if(option1==5){
                int sum=0,t=lista.size();
                float p;
                for(data x : lista){
                    if(x.type.equals("AFT")) sum+=x.cost;
                }

                p=sum/t;
                System.out.println("El promedio de costo de los AFT es " + p);
            }
            if(option1==6){
                int s;
                int sum=0;

                System.out.println("Costo: ");

                s=sc.nextInt();

                for(data x : lista) {
                    if (x.cost==s && x.type.equals("MU")) sum++;
                }

                System.out.println("Tienen ese costo " + sum + "MU");
            }
        }

    }
}
