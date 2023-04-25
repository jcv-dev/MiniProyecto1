package logica;

public class Gato extends Mascota{

    private String lecheFavorita;

    public Gato(String nombre, byte edad, byte vacunasAplicadas, float costo, String paisOrigen, byte dientes, String color, boolean vacunaMalota, String lecheFavorita) {
        
        super(nombre, edad, vacunasAplicadas, costo, paisOrigen, dientes, color, vacunaMalota);
        this.lecheFavorita = lecheFavorita;
    }

    @Override
    public void sonido() {
        
        System.out.println("El gato hace: meow");
    }

    @Override
    public void comoOrina() {
        
        System.out.println("El gato se agacha en la arena para orinar.");
    }
    
}