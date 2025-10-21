import java.util.*;
import java.io.*;

public class pedro {

    public static class trabajadores {
        String ci;
        String nombre;
        int edad;
        int salario;
        boolean docencia;
        String grado;
        String area;

    }

    static void menu() {
        System.out.println("Menu");
        System.out.println("1- Insertar, Modificar o Eliminar");
        System.out.println("2- Buscar salarios");
        System.out.println("3- Buscar docentes por CI");
        System.out.println("4- Lista de Dr. en la Universidad");
        System.out.println("5- Promedio de Edades");
        System.out.println("6- Trabajadores por Areas");
        System.out.println("7- Generar fichero <------ TOdaVia");
        System.out.println("8- Terminar");

    }

    static void submenu1() {
        System.out.println("1- Insertar");
        System.out.println("2- Modificar");
        System.out.println("3- Eliminar");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<trabajadores> lista = new ArrayList<>();

        int option1 = 0, option2;

        while (option1 != 8) {

            menu();
            option1 = sc.nextInt();

            if (option1 == 1) {

                submenu1();

                option2 = sc.nextInt();

                while (option2 == 1) {
                    System.out.println("Intruduce los siguientes datos:");

                    trabajadores t = new trabajadores();
                    boolean con = true;
                    sc.nextLine();

                    System.out.print("Ci: ");
                    t.ci = sc.nextLine();
                    System.out.print("Nombre y apellido: ");
                    t.nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    t.edad = sc.nextInt();
                    System.out.print("Salario: ");
                    t.salario = sc.nextInt();
                    System.out.print("Es docente? true/false: ");
                    t.docencia = sc.nextBoolean();
                    System.out.print("Grado Cientifico: ");
                    t.grado = sc.next();
                    System.out.print("Area: ");
                    t.area = sc.next();
                    lista.add(t);

                    System.out.print("Desea introducir mas datos? true/false: ");
                    con = sc.nextBoolean();

                    if (!con) break;

                }

                while (option2 == 2) {
                    System.out.println("numero del dato a modificar?");

                    for (int i = 0; i <= lista.size() - 1; i++) {
                        trabajadores t = lista.get(i);
                        System.out.println(i + 1 + "- Ci: " + t.ci + " Nombre: " + t.nombre + " Edad: " + t.edad + " Salario: " +
                                t.salario + " Es Docente? true/false: " + t.docencia + " Grado Cientifico: " + t.grado +
                                " Area: " + t.area);
                    }

                    int a = sc.nextInt() - 1;
                    trabajadores t = new trabajadores();
                    boolean con = true;
                    sc.nextLine();

                    System.out.println("Intruduce los siguientes datos:");
                    System.out.print("Ci: ");
                    t.ci = sc.nextLine();
                    System.out.print("Nombre y apellido: ");
                    t.nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    t.edad = sc.nextInt();
                    System.out.print("Salario: ");
                    t.salario = sc.nextInt();
                    System.out.print("Es docente? true/false: ");
                    t.docencia = sc.nextBoolean();
                    System.out.print("Grado Cientifico: ");
                    t.grado = sc.next();
                    System.out.print("Area: ");
                    t.area = sc.next();
                    lista.set(a, t);

                    System.out.print("Desea modificar otro dato? true/false: ");
                    con = sc.nextBoolean();

                    if (!con) break;

                }

                if (option2 == 3) {
                    System.out.println("numero del dato a eliminar?");
                    for (int i = 0; i <= lista.size() - 1; i++) {
                        trabajadores t = lista.get(i);
                        System.out.println(i + 1 + "- Ci: " + t.ci + " Nombre: " + t.nombre + " Edad: " + t.edad + " Salario: " +
                                t.salario + " Es Docente? true/false: " + t.docencia + " Grado Cientifico: " + t.grado +
                                " Area: " + t.area);
                    }
                    int a = sc.nextInt() - 1;
                    lista.remove(a);
                }
            }

            while (option1 == 2) {
                int salario, sum = 0;
                boolean con = true;

                System.out.print("Salario base a buscar: ");
                salario = sc.nextInt();

                for (trabajadores x : lista) {
                    if (x.salario > salario) sum++;
                }

                System.out.println(sum + " Trabajadores tienen mayor salario " + '\n');
                System.out.print("Desea buscar otro salario?: ");

                con = sc.nextBoolean();
                if (!con) break;

            }
            while (option1 == 3) {
                String ci;
                boolean con = true;
                int sum = 0;

                System.out.print("CI a buscar: ");
                sc.nextLine();
                ci = sc.nextLine();

                for (trabajadores x : lista) {
                    if (x.ci.equals(ci) && x.docencia == true) {
                        System.out.println("Es Docente");
                        sum++;
                    } else if (x.ci.equals(ci) && x.docencia == false) {
                        System.out.println("No es docente");
                        sum++;
                    }

                }
                if (sum == 0) System.out.println("No existe ese CI");

                System.out.print("Desea buscar otro CI?: ");

                con = sc.nextBoolean();
                if (!con) break;

            }
            if (option1 == 4) {
                int sum = 0;
                for (trabajadores x : lista) {
                    if (x.grado.equals("Dr")) sum++;
                }
                System.out.println("La cantidad de Dr se de " + sum);
            }
            if (option1 == 5) {
                int sum = 0;
                float prom = 0;
                for (trabajadores x : lista) {
                    sum += x.edad;
                }
                prom = sum / lista.size();
                System.out.println("El promedio de edad es de " + prom);
            }
            while (option1 == 6) {
                String area;
                ArrayList<String> nombres = new ArrayList<>();
                boolean con = true;
                int sum = 0;

                System.out.print("Area a buscar: ");
                sc.nextLine();
                area = sc.nextLine();

                for (trabajadores x : lista) {
                    if (x.area.equals(area)) {
                        nombres.add(x.nombre);
                        sum++;
                    }

                }
                if (sum == 0) System.out.println("No existe esa Area");
                else {
                    System.out.println("Los Trabajadores de esa Area son: ");

                    for (String s : nombres) {
                        System.out.println(s);
                    }
                }

                System.out.print("Desea buscar otra Area? true/false: ");

                con = sc.nextBoolean();
                if (!con) break;

            }

        }
    }
}




