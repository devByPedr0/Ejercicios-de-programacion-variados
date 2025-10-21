import java.util.Scanner;

public class Main {

    static void menu() {

        System.out.println("--------------------------------");
        System.out.println("           Menu:");
        System.out.println("1-  Agregar estudiante");
        System.out.println("2-  Agregar profesor");
        System.out.println("3-  Agregar curso");
        System.out.println("4-  Inscribir estudiante en curso");
        System.out.println("5-  Retirar estudiante de curso");
        System.out.println("6-  Registrar nota");
        System.out.println("7-  Mostrar promedio estudiante");
        System.out.println("8-  Mostrar estadísticas de curso");
        System.out.println("9-  Top N estudiantes por curso");
        System.out.println("10- Compactar estudiantes (eliminar inactivos)");
        System.out.println("11- Pruebas de muestra");
        System.out.println("12- Salir");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        menu();

        int option1 = sc.nextInt();
        sc.nextLine();

        while (option1 != 12) {

            menu();
            option1 = sc.nextInt();
            sc.nextLine();

            switch (option1) {

                case 1 -> {

                    Sistema.agregarEstudiante();
                    break;
                }
                case 2 -> {
                    break;
                }
                case 3 -> {
                    break;
                }
                case 4 -> {
                    break;
                }
                case 5 -> {
                    break;
                }
                case 6 -> {
                    break;
                }
                case 7 -> {
                    break;
                }
                case 8 -> {
                    break;
                }
                case 9 -> {
                    break;
                }
                case 10 -> {
                    break;
                }
                case 11 -> {
                    break;
                }
                case 12 -> {
                    break;
                }
                default -> {

                }

            }
        }
    }
}