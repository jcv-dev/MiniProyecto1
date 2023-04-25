package logica;

public class Perro extends Mascota{

    private byte caminatasPorSemana;



    @Override
    public void sonido() {
    
        System.out.println("El perro hace: woof ");
    }

    @Override
    public void comoOrina() {

        System.out.println("El perro levanta la pata para orinar.");
    }

    public Perro(String nombre, byte edad, byte vacunasAplicadas, float costo, String paisOrigen, byte dientes, String color, boolean vacunaMalota, String sexo, byte caminatasPorSemana) {

        super(nombre, edad, vacunasAplicadas, costo, paisOrigen, dientes, color, vacunaMalota, sexo);
        this.caminatasPorSemana = caminatasPorSemana;
    }

    public byte getCaminatasPorSemana() {
        return caminatasPorSemana;
    }

    public void setCaminatasPorSemana(byte caminatasPorSemana) {
        this.caminatasPorSemana = caminatasPorSemana;
    }

    
}

