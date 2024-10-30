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
    public void encolarGuerrero(){

    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public int calculoPoder() {
        double resultadoNivelPoder;

        if (raza.equals("Saiyajin")) {
            resultadoNivelPoder = nivelPoder * 1.5;
            return (int) resultadoNivelPoder;
        } else if (raza.equals("Namekusein")) {
            resultadoNivelPoder = nivelPoder * 1.2;
            return (int) resultadoNivelPoder;
        } else if (raza.equals("Terricola")) {
            resultadoNivelPoder = nivelPoder * 1;
            return (int) resultadoNivelPoder;
        } else {
            System.out.println("Raza no encontrada");
            return -1;
        }
    }
}
