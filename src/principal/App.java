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

            Gato gato = new Gato(nombreMascota, edadMascota, vacunasMascota, costoMascota, paisMascota, dientesMascota, colorMascota, vacunaMalota, lecheFavorita);
            gatos.add(gato);

            case 2:
            System.out.print("Cantidad de caminatas por semana: ");
            caminatasMascota = scanner.nextByte();

            Perro perro = new Perro(nombreMascota, edadMascota, vacunasMascota, costoMascota, paisMascota, dientesMascota, colorMascota, vacunaMalota, caminatasMascota);
            perros.add(perro);
        }
    }


    public static void actualizarMascota() {}


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