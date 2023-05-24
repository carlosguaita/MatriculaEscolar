public class Materia {

    private String nombre;
    private String id;
    private int creditos;

    public Materia(String nombre, String id, int creditos) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
