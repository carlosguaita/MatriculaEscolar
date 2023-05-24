import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{

    private List<Materia> listaMaterias =  new ArrayList<>();
    private String colegio;
    private int nivel;

    public Estudiante(String nombre, String cedula, int edad, String estadoCivil, List<Materia> listaMaterias, String colegio, int nivel) {
        super(nombre, cedula, edad, estadoCivil);
        this.listaMaterias = listaMaterias;
        this.colegio = colegio;
        this.nivel = nivel;
    }

    public List<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
