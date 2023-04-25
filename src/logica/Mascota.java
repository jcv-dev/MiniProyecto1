package logica;

public abstract class Mascota {
    
    private String nombre;
    private byte edad;
    private byte vacunasAplicadas;
    private float costo;
    private String paisOrigen;
    private byte dientes;
    private String color;
    private boolean vacunaMalota;


    public Mascota(String nombre, byte edad, byte vacunasAplicadas, float costo, String paisOrigen, byte dientes, String color, boolean vacunaMalota) {
        this.nombre = nombre;
        this.edad = edad;
        this.vacunasAplicadas = vacunasAplicadas;
        this.costo = costo;
        this.paisOrigen = paisOrigen;
        this.dientes = dientes;
        this.color = color;
        this.vacunaMalota = vacunaMalota;
    }

    public abstract void sonido();

    public abstract void comoOrina();

}