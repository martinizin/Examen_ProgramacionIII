public class Guerrero {
    private String nombre;
    private String raza;
    private int nivelPoder;
    private String habilidad;

    public Guerrero() {
        this.nombre = "Goku";
        this.raza = "Saiyajin";
        this.nivelPoder = 924;
        this.habilidad = "kamehameha";
    }

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
//Segundo método
    public int calculoPoder() {

        double resultadoNivelPoder = switch (raza) {
            case "Saiyajin" -> nivelPoder * 1.5;
            case "Namekusein" -> nivelPoder * 1.2;
            case "Terricola" -> nivelPoder;
            default -> nivelPoder;
        };
        return (int) resultadoNivelPoder;
    }

    public String getNombre() { return nombre; }
    public String getRaza() { return raza; }
    public int getNivelPoder() { return nivelPoder; }
    public String getHabilidad() { return habilidad; }

}
