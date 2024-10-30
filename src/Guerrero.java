public class Guerrero {
    private String nombre;
    private String raza;
    private int nivelPoder;
    private String habilidad;

    public Guerrero(String nombre, String raza, int nivelPoder, String habilidad) {
        this.nombre = nombre;
        this.raza = raza;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + "\n" +
                "Raza: " + raza + "\n" +
                "Nivel de Poder: " + nivelPoder + "\n" +
                "Habilidad: " + habilidad;
    }



}

