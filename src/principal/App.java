package principal;
import logica.Mascota;
import logica.Perro;
import logica.Gato;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Gato> gatos = new ArrayList<Gato>();
    static ArrayList<Perro> perros = new ArrayList<Perro>();
    static String nombreMascota, paisMascota, colorMascota, sexoMascota, lecheFavorita;
    static int tipoMascota, opcion = 0, seleccionBooleano;
    static float costoMascota;
    static boolean vacunaMalota;
    static byte edadMascota, dientesMascota, vacunasMascota, caminatasMascota;


    public static void menuPrincipal() {
        while(true){
        do{
        clrscr();
        System.out.print("****************************** BIENVENIDO A NUESTRA VETERINARIA ******************************\n"+
                           "\n1. Crear mascota.\n"+
                           "2. Actualizar mascota.\n"+
                           "3. Eliminar mascota.\n"+
                           "4. Buscar mascota por nombre.\n"+
                           "5. Listar mascotas.\n"+
                           "6. Terminar.\n"+
                           "\nSeleccione su opcion: ");

        opcion = scanner.nextInt();
        scanner.nextLine();
        }while(opcion < 0 || opcion > 7);

        switch(opcion) {
            case 1:
                crearMascota();
                break;
            case 2:
                actualizarMascota();
                break;
            case 3:
                eliminarMascota();
                break;
            case 4:
                buscarMascotaPorNombre();
                break;
            case 5:
                listarMascotas();
                break;
            case 6:
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    }


    public static void crearMascota() {

        clrscr();
        System.out.print("Su mascota es un...\n"+
                         "1. Gato\n"+
                         "2. Perro\n"+
                         "\nSeleccione su opcion: ");

        tipoMascota = scanner.nextInt();
        scanner.nextLine();

        clrscr();

        System.out.print("Nombre: ");
        nombreMascota = scanner.nextLine();

        System.out.print("Edad: ");
        edadMascota = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Cantidad de vacunas aplicadas: ");
        vacunasMascota = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Costo: ");
        costoMascota = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Pais de origen: ");
        paisMascota = scanner.nextLine();

        System.out.print("Cantidad de dientes: ");
        dientesMascota = scanner.nextByte();
        scanner.nextLine();

        System.out.print("Color: ");
        colorMascota = scanner.nextLine();

        System.out.print("Sexo: ");
        sexoMascota = scanner.nextLine();

        do{
            clrscr();

            System.out.print("Se le ha aplicado la vacuna Malota?\n"+
                             "1. Si\n"+
                             "2. No\n"+
                             "\nSeleccione su opcion: ");

            seleccionBooleano = scanner.nextInt();
            scanner.nextLine();
        }while(seleccionBooleano < 1 || seleccionBooleano > 2);

        vacunaMalota = intABoolean(seleccionBooleano);

        clrscr();
        switch(tipoMascota){

            case 1:
            System.out.print("Leche favorita: ");
            lecheFavorita = scanner.nextLine();

            Gato gato = new Gato(nombreMascota, edadMascota, vacunasMascota, costoMascota, paisMascota, dientesMascota, colorMascota, vacunaMalota, sexoMascota, lecheFavorita, id);
            gatos.add(gato);

            case 2:
            System.out.print("Cantidad de caminatas por semana: ");
            caminatasMascota = scanner.nextByte();

            Perro perro = new Perro(nombreMascota, edadMascota, vacunasMascota, costoMascota, paisMascota, dientesMascota, colorMascota, vacunaMalota, sexoMascota, caminatasMascota, id);
            perros.add(perro);
        }
    }


    public static void actualizarMascota() {



        clrscr();
        System.out.print("Su mascota es un...\n"+
                         "1. Gato\n"+
                         "2. Perro\n"+
                         "3. Salir\n"+
                         "\nSeleccione su opcion: ");

        tipoMascota = scanner.nextInt();
        scanner.nextLine();

        switch(tipoMascota){

            case 1:
            System.out.print("Escriba aqui el nombre de su gato: ");
            nombreMascota = scanner.nextLine();

            for(int i = 0; i < gatos.size(); i++){
                if (nombreMascota == gatos.get(i).getNombre()){
                    System.out.print("Ingrese que tipo de dato de su gato desea actualizar...\n"+
                         "1. Nombre \n"+
                         "2. Edad \n"+
                         "3. Vacunas aplicadas \n"+
                         "4. Costo \n"+
                         "5. Pais de origen \n"+
                         "6. Dientes \n"+
                         "7. Color \n"+
                         "8. Vacuna Malota \n"+
                         "9. Sexo \n"+
                         "10. Leche favorita \n"+
                         "\nSeleccione su opcion: ");

                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch(opcion){
                        case 1:
                        System.out.println("Ingrese el nombre actual de su gato: ");
                        nombreMascota = scanner.nextLine();
                        gatos.get(i).setNombre(nombreMascota);
                        scanner.nextLine();

                        break;

                        case 2:
                        System.out.println("Ingrese la edad actual de su gato: ");
                        edadMascota = scanner.nextByte();
                        gatos.get(i).setEdad(edadMascota);
                        scanner.nextLine();
                        
                        break;

                        case 3:
                        System.out.println("Ingrese cuantas vacunas lleva aplicada su gato: ");
                        vacunasMascota = scanner.nextByte();
                        gatos.get(i).setVacunasAplicadas(vacunasMascota);
                        scanner.nextLine();
                        
                        break;

                        case 4:
                        System.out.println("Ingrese el precio de su gato: ");
                        costoMascota = scanner.nextFloat();
                        gatos.get(i).setCosto(costoMascota);
                        scanner.nextLine();
                        
                        break;

                        case 5:
                        System.out.println("Ingrese el pais de origen de su gato: ");
                        paisMascota = scanner.nextLine();
                        gatos.get(i).setPaisOrigen(paisMascota);
                        scanner.nextLine();
                        
                        break;

                        case 6:
                        System.out.println("Ingrese cuantos dientes tiene su gato: ");
                        dientesMascota = scanner.nextByte();
                        gatos.get(i).setDientes(dientesMascota);
                        scanner.nextLine();
                        
                        break;

                        case 7:
                        System.out.println("Ingrese el color de su gato: ");
                        colorMascota = scanner.nextLine();
                        gatos.get(i).setColor(colorMascota);
                        scanner.nextLine();
                        
                        break;

                        case 8:

                        do{
                            clrscr();
                
                            System.out.print("Se le ha aplicado la vacuna Malota?\n"+
                                             "1. Si\n"+
                                             "2. No\n"+
                                             "\nSeleccione su opcion: ");
                
                            seleccionBooleano = scanner.nextInt();
                            scanner.nextLine();
                        }while(seleccionBooleano < 1 || seleccionBooleano > 2);
                
                        gatos.get(i).setVacunaMalota(intABoolean(seleccionBooleano));

                        
                        break;

                        case 9:
                        System.out.println("Ingrese el sexo de su gato: ");
                        sexoMascota = scanner.nextLine();
                        gatos.get(i).setSexo(sexoMascota);
                        scanner.nextLine();
                        
                        break;

                        case 10:
                        System.out.println("Ingrese la leche favorita de su gato: ");
                        lecheFavorita = scanner.nextLine();
                        gatos.get(i).setLecheFavorita(lecheFavorita);
                        scanner.nextLine();
                        
                        break;

                    }
                }
                else{
                    System.out.println("El nombre de la mascota es incorrecto o no esta registrada.");
                }
            }
            break;

            case 2:
            System.out.print("Escriba aqui el nombre de su perro: ");
            nombreMascota = scanner.nextLine();

            for(int i = 0; i < perros.size(); i++){
                if (nombreMascota == perros.get(i).getNombre()){
                    System.out.print("Ingrese que tipo de dato de su perro desea actualizar...\n"+
                         "1. Nombre \n"+
                         "2. Edad \n"+
                         "3. Vacunas aplicadas \n"+
                         "4. Costo \n"+
                         "5. Pais de origen \n"+
                         "6. Dientes \n"+
                         "7. Color \n"+
                         "8. Vacuna Malota \n"+
                         "9. Sexo \n"+
                         "10. Caminatas por semana \n"+
                         "\nSeleccione su opcion: ");

                    opcion = scanner.nextInt();
                    scanner.nextLine();

                    switch(opcion){
                        case 1:
                        System.out.println("Ingrese el nombre actual de su perro: ");
                        nombreMascota = scanner.nextLine();
                        perros.get(i).setNombre(nombreMascota);
                        scanner.nextLine();

                        break;

                        case 2:
                        System.out.println("Ingrese la edad actual de su perro: ");
                        edadMascota = scanner.nextByte();
                        perros.get(i).setEdad(edadMascota);
                        scanner.nextLine();
                        
                        break;

                        case 3:
                        System.out.println("Ingrese cuantas vacunas lleva aplicada su perro: ");
                        vacunasMascota = scanner.nextByte();
                        perros.get(i).setVacunasAplicadas(vacunasMascota);
                        scanner.nextLine();
                        
                        break;

                        case 4:
                        System.out.println("Ingrese el precio de su perro: ");
                        costoMascota = scanner.nextFloat();
                        perros.get(i).setCosto(costoMascota);
                        scanner.nextLine();
                        
                        break;

                        case 5:
                        System.out.println("Ingrese el pais de origen de su perro: ");
                        paisMascota = scanner.nextLine();
                        perros.get(i).setPaisOrigen(paisMascota);
                        scanner.nextLine();
                        
                        break;

                        case 6:
                        System.out.println("Ingrese cuantos dientes tiene su perro: ");
                        dientesMascota = scanner.nextByte();
                        perros.get(i).setDientes(dientesMascota);
                        scanner.nextLine();
                        
                        break;

                        case 7:
                        System.out.println("Ingrese el color de su perro: ");
                        colorMascota = scanner.nextLine();
                        perros.get(i).setColor(colorMascota);
                        scanner.nextLine();
                        
                        break;

                        case 8:

                        do{
                            clrscr();
                
                            System.out.print("Se le ha aplicado la vacuna Malota?\n"+
                                             "1. Si\n"+
                                             "2. No\n"+
                                             "\nSeleccione su opcion: ");
                
                            seleccionBooleano = scanner.nextInt();
                            scanner.nextLine();
                        }while(seleccionBooleano < 1 || seleccionBooleano > 2);
                
                        perros.get(i).setVacunaMalota(intABoolean(seleccionBooleano));

                        
                        break;

                        case 9:
                        System.out.println("Ingrese el sexo de su perro: ");
                        sexoMascota = scanner.nextLine();
                        perros.get(i).setSexo(sexoMascota);
                        scanner.nextLine();
                        
                        break;

                        case 10:
                        System.out.println("Ingrese cuantas caminatas a la semana le da a su perro: ");
                        caminatasMascota = scanner.nextByte();
                        perros.get(i).setCaminatasPorSemana(caminatasMascota);
                        scanner.nextLine();
                        
                        break;

                    }
                    
                }

                else{
                    System.out.println("El nombre de la mascota es incorrecto o no esta registrada.");
                }

            }
            break;

            case 3:
            menuPrincipal();
            break;
    }
    
}

    public static void eliminarMascota() {}


    public static void buscarMascotaPorNombre() {}


    public static void listarMascotas() {}

    public static boolean intABoolean(int n) {

        switch(n){
            case 1:
                return true;
            case 2:
                return false;
            default:
                return false;
        }
    }

    public static void clrscr(){

        //Metodo para limpiar consola (cls)
    
        try {
    
            if (System.getProperty("os.name").contains("Windows"))
    
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    
            else
    
                Runtime.getRuntime().exec("clear");
    
        } catch (IOException | InterruptedException ex) {}
    
    }


    public static void main(String[] args) throws Exception {
        
        menuPrincipal();
    }
}