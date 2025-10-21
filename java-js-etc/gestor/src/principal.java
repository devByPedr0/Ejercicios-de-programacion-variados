import  java.util.*;

public class principal {

    public static class Jobs{
        String title;
        String description;
        String sector;
        String xp;
        String firm;
        String month;
    }

    static void menu(){

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("        Menú:");
        System.out.println("1- Listado de empleos");
        System.out.println("2- Publicar empleo");
        System.out.println("3- Estadísticas generales");
        System.out.println("4- Terminar");
        System.out.println();
        System.out.print("   Seleccione una opción... ");
        System.out.println();
    }

    static void SubmenuJobList1(){

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("1- Empleos por sectores");
        System.out.println("2- Listado general");
        System.out.println("3- Volver");
        System.out.println();
        System.out.print("   Seleccione una opción... ");
        System.out.println();
    }

    static void SubmenuJobList2(){

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("1- Salud");
        System.out.println("2- Tecnología");
        System.out.println("3- Educación");
        System.out.println("4- Cultura");
        System.out.println("5- Volver");
        System.out.println();
        System.out.print("   Seleccione una opción... ");
        System.out.println();
    }

    static void Submenu1PostJob(){

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("1- Publicar empleo");
        System.out.println("2- Editar publicación existente");
        System.out.println("3- Eliminar publicación existente");
        System.out.println("4- Volver");
        System.out.println();
        System.out.print("   Seleccione una opción... ");
        System.out.println();
    }

    static void SubmenuStatistics(){

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("1- Vacantes disponibles");
        System.out.println("2- Vacantes cubiertas");
        System.out.println("3- Promedio de vacantes disponibles por sector al mes");
        System.out.println("4- Volver");
        System.out.println();
        System.out.print("   Seleccione una opción... ");
        System.out.println();
    }

    static void SubmenuStatistics1(){

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("1-  Enero");
        System.out.println("2-  Febrero");
        System.out.println("3-  Marzo");
        System.out.println("4-  Abril");
        System.out.println("5-  Mayo");
        System.out.println("6-  Junio");
        System.out.println("7-  Julio");
        System.out.println("8-  Agosto");
        System.out.println("9-  Septiembre");
        System.out.println("10- Octubre");
        System.out.println("11- Noviembre");
        System.out.println("12- Diciembre");
        System.out.println("13- Volver");
        System.out.println();
        System.out.print("    Seleccione una opción... ");
        System.out.println();
    }

    static boolean check(String s,int t){
        int cont=0;
        boolean b=false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ' && b==false){ cont++; b=true; }
            else if(s.charAt(i)==' ') b=false;
        }

        if(t>=cont) return true;
        else return false;

    }

    static Jobs insert(){

        Scanner sc = new Scanner(System.in);
        Jobs j = new Jobs();

        System.out.print("Título de la publicación (max 10 palabras): ");
        j.title = sc.nextLine().trim();

        while(!check(j.title,10)){
            System.out.print("Título de la publicación muy largo, introduzca otro (max 10 palabras): ");
            j.title = sc.nextLine().trim();
        }

        System.out.print("Descripción de la publicación (max 50 palabras): ");
        j.description = sc.nextLine().trim();

        while(!check(j.description,50)){
            System.out.print("Descripción de la publicación muy larga, introduzca otra (max 50 palabras): ");
            j.description = sc.nextLine().trim();
        }

        System.out.print("Sector al que pertenece la oferta laboral (Salud, Educación, Cultura, Tecnología): ");
        j.sector = sc.next().trim();

        while(true){

            if(j.sector.equalsIgnoreCase("Salud")) break;
            if(j.sector.equalsIgnoreCase("Cultura")) break;
            if(j.sector.equalsIgnoreCase("Educacion")) break;
            if(j.sector.equalsIgnoreCase("Tecnologia")) break;
            if(j.sector.equalsIgnoreCase("Educación")) break;
            if(j.sector.equalsIgnoreCase("Tecnología")) break;

            System.out.print("Sector incorrecto, introduzca otro (Salud, Educación, Cultura, Tecnología): ");
            j.sector = sc.next().trim();
        }

        System.out.print("Años de experiencia laboral requeridos (0-100): ");
        j.xp = sc.next().trim();

        while(!j.xp.matches("[0-9]+")){
            System.out.print("Años de experiencia laboral incorrectos, intente de nuevo (0-100): ");
            j.xp = sc.next().trim();
        }

        System.out.print("Nombre de la empresa: ");
        j.firm = sc.next().trim();

        while(!j.firm.matches("[a-zA-Z]+")){
            System.out.print("Nombre de la empresa incorrecto, intente de nuevo (a-Z): ");
            j.firm = sc.next().trim();

        }

        System.out.print("Mes de la publicación (Enero/.../Diciembre): ");
        j.month = sc.next().trim();

        while(true){

         if(j.month.equalsIgnoreCase("enero") || j.month.equalsIgnoreCase("febrero") || j.month.equalsIgnoreCase("marzo") || j.month.equalsIgnoreCase("abril") || j.month.equalsIgnoreCase("mayo") || j.month.equalsIgnoreCase("junio") ||
            j.month.equalsIgnoreCase("julio") || j.month.equalsIgnoreCase("agosto") || j.month.equalsIgnoreCase("septiembre") || j.month.equalsIgnoreCase("octubre") || j.month.equalsIgnoreCase("noviembre") || j.month.equalsIgnoreCase("diciembre"))

            break;

            System.out.print("Mes de la publicación incorrecto, intente de nuevo (Enero/.../Diciembre): ");
            j.month = sc.next().trim();

        }

        return j;
    }

    static int promediopormes(ArrayList<Jobs> j,String mes){

        mes = mes.toLowerCase();
        int vacantes=0;

        if(mes.equals("enero")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("enero"))
                    vacantes++;
            }
        }
        if(mes.equals("febrero")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("febrero"))
                    vacantes++;
            }
        }
        if(mes.equals("marzo")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("marzo"))
                    vacantes++;
            }
        }
        if(mes.equals("abril")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("abril"))
                    vacantes++;
            }
        }
        if(mes.equals("mayo")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("mayo"))
                    vacantes++;
            }
        }
        if(mes.equals("junio")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("junio"))
                    vacantes++;
            }
        }
        if(mes.equals("julio")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("julio"))
                    vacantes++;
            }
        }
        if(mes.equals("agosto")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("agosto"))
                    vacantes++;
            }
        }
        if(mes.equals("septiembre")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("septiembre"))
                    vacantes++;
            }
        }
        if(mes.equals("octubre")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("octubre"))
                    vacantes++;
            }
        }
        if(mes.equals("noviembre")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("noviembre"))
                    vacantes++;
            }
        }
        if(mes.equals("diciembre")){

            for(Jobs x : j){
                if(x.month.equalsIgnoreCase("diciembre"))
                    vacantes++;
            }
        }

        return vacantes;
    }

    static void show(ArrayList<Jobs> l){
        int cont=0;

        for(Jobs j : l){

            cont++;
            System.out.print(cont + "- ");

            System.out.println("Título: " + j.title + "  -Hecha por: " + j.firm);

        }

    }

    static void fullshow(Jobs j){

        System.out.println();
        System.out.println("-Título: " + j.title);
        System.out.println("-Descripción: " + j.description);
        System.out.println("-Sector: " + j.sector);
        System.out.println("-Experiencia Requerida: " + j.sector);
        System.out.println("-Empresa: " + j.firm);
        System.out.println("-Mes: " + j.month);
    }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            menu();
            ArrayList<Jobs> list = new ArrayList<>();
            String option1 = sc.next().trim();
            boolean b = false;
            String option2 = "", option3 = "", option4 = "", option5 = "", option6 = "";
            int plazascubiertas=0;

            while (!option1.equals("4")) {

                if (option1.equals("1")) while (option1.equals("1")) { //listado de trabajos

                    if (!b && !option3.equals("5")) {
                        SubmenuJobList1();
                        option2 = sc.next().trim();
                    }

                    b = false;

                    if (option2.equals("1")) while (option2.equals("1")) { //listado por sectores

                        if (!b) {
                            SubmenuJobList2();
                            option3 = sc.next().trim();
                        }

                        b = false;

                        if (option3.equals("1")) { // salud

                            for(Jobs j : list){

                                if(j.sector.equalsIgnoreCase("Salud")){

                                    fullshow(j);
                                }

                            }


                        } else if (option3.equals("2")) { // tecnologia

                            for(Jobs j : list){

                                if(j.sector.equalsIgnoreCase("Tecnología") || j.sector.equalsIgnoreCase("Tecnologia")){

                                    fullshow(j);
                                }

                            }


                        } else if (option3.equals("3")) { // educacion

                            for(Jobs j : list){

                                if(j.sector.equalsIgnoreCase("Educación") || j.sector.equalsIgnoreCase("Educacion")){

                                    fullshow(j);
                                }

                            }


                        } else if (option3.equals("4")) { // cultura

                            for(Jobs j : list){

                                if(j.sector.equalsIgnoreCase("Cultura")){

                                    fullshow(j);
                                }

                            }


                        } else if (option3.equals("5")) { //volver

                            SubmenuJobList1();
                            option2 = sc.next().trim();
                        } else {
                            b = true;
                            System.out.print("Opcion errónea, introduzca un valor en el rango 1-5 ");
                            option3 = sc.next().trim();
                        }

                    }

                    else if (option2.equals("2")) { //listado general

                        for(Jobs j : list){

                            fullshow(j);

                        }
                        SubmenuJobList1();
                        option2 = sc.next().trim();

                    } else if (option2.equals("3")) { //volver

                        menu();
                        option1 = sc.next().trim();

                    } else {
                        b = true;
                        System.out.print("Opcion errónea, introduzca un valor en el rango 1-3 ");
                        option2 = sc.next().trim();
                    }

                }


                else if (option1.equals("2")) while (option1.equals("2")) { //Publicar

                    if (!b) {
                        Submenu1PostJob();
                        option4 = sc.next().trim();
                    }

                    b = false;

                    if (option4.equals("1")) { // Agregar

                        list.add(insert());

                    } else if (option4.equals("2")) { //Modificar

                        if(list.size()==0){
                            System.out.println("No existen publicaciones...");
                            break;
                        }

                        show(list);

                        System.out.print("Elija la publicación a modificar (1,2,3...): ");
                        String option = sc.next().trim();
                        int a=0;

                        if(option.matches("[0-9]+"))
                        a= Integer.parseInt(option);

                        while(a>list.size() || a<=0){

                            System.out.print("Opcion errónea, inserte un valor entre 1 y " + list.size() + " :" );

                            option = sc.next().trim();
                            if(option.matches("[0-9]+"))
                                a= Integer.parseInt(option);

                        }

                        list.set(a-1,insert());

                    } else if (option4.equals("3")) { // Eliminar

                        if(list.size()==0){
                            System.out.println("No existen publicaciones...");
                            break;
                        }
                        show(list);

                        System.out.print("Elija la publicación a eliminar (1,2,3...): ");
                        String option = sc.next().trim();
                        int a=0;

                        if(option.matches("[0-9]+"))
                            a= Integer.parseInt(option);

                        while(a>list.size() || a<=0){

                            System.out.print("Opcion errónea, inserte un valor entre 1 y " + list.size() + " :" );

                            option = sc.next().trim();
                            if(option.matches("[0-9]+"))
                                a= Integer.parseInt(option);

                        }

                        list.remove(a-1); plazascubiertas++;

                    } else if (option4.equals("4")) { // Volver
                        menu();
                        option1 = sc.next().trim();
                    } else {
                        b = true;
                        System.out.print("Opcion errónea, introduzca un valor en el rango 1-4 ");
                        option4 = sc.next().trim();
                    }

                }

                else if (option1.equals("3")) while (option1.equals("3")) { //estadisticas

                    if (!b && !option6.equals("13")) {
                        SubmenuStatistics();
                        option5 = sc.next().trim();
                    }

                    b = false;

                    if (option5.equals("1")) { //vacantes disponibles

                        System.out.println("Hay " + list.size() + " vacantes disponibles");

                    } else if (option5.equals("2")) { //vacantes cubiertas

                        System.out.println("Hay " + plazascubiertas + " vacantes cubiertas");

                    } else if (option5.equals("3")) while (option5.equals("3")) { //vacantes disponibles por mes

                        if (!b) {
                            SubmenuStatistics1();
                            option6 = sc.next().trim();
                        }

                        b = false;

                        if (option6.equals("1")) { //enero

                            System.out.println("En el mes de enero");

                        } else if (option6.equals("2")) {

                        } else if (option6.equals("3")) {

                        } else if (option6.equals("4")) {

                        } else if (option6.equals("5")) {

                        } else if (option6.equals("6")) {

                        } else if (option6.equals("7")) {

                        } else if (option6.equals("8")) {

                        } else if (option6.equals("9")) {

                        } else if (option6.equals("10")) {

                        } else if (option6.equals("11")) {

                        } else if (option6.equals("12")) { //diciembre

                        } else if (option6.equals("13")) { //volver
                            SubmenuStatistics();
                            option5 = sc.next().trim();
                        } else {
                            b = true;
                            System.out.print("Opcion errónea, introduzca un valor en el rango 1-13 ");
                            option6 = sc.next().trim();
                        }
                    }

                    else if (option5.equals("4")) { //terminar
                        menu();
                        option1 = sc.next().trim();
                    } else {
                        b = true;
                        System.out.print("Opcion errónea, introduzca un valor en el rango 1-4 ");
                        option5 = sc.next().trim();
                    }

                }

                else {

                    System.out.print("Opcion errónea, introduzca un valor en el rango 1-4 ");
                    option1 = sc.next().trim();
                }
            }
        }
    }

