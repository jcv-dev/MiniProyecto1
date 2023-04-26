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
    private String sexo;


    public Mascota(String nombre, byte edad, byte vacunasAplicadas, float costo, String paisOrigen, byte dientes, String color, boolean vacunaMalota, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.vacunasAplicadas = vacunasAplicadas;
        this.costo = costo;
        this.paisOrigen = paisOrigen;
        this.dientes = dientes;
        this.color = color;
        this.vacunaMalota = vacunaMalota;
        this.sexo = sexo;
    }

    public abstract void sonido();

    public abstract void comoOrina();

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public byte getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    public float getCosto() {
        return costo;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public byte getDientes() {
        return dientes;
    }

    public String getColor() {
        return color;
    }

    public boolean isVacunaMalota() {
        return vacunaMalota;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setVacunasAplicadas(byte vacunasAplicadas) {
        this.vacunasAplicadas = vacunasAplicadas;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setDientes(byte dientes) {
        this.dientes = dientes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVacunaMalota(boolean vacunaMalota) {
        this.vacunaMalota = vacunaMalota;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}

