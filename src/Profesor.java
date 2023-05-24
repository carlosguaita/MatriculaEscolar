import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{

   private List<Materia> listaMateriaAsignadas = new ArrayList<>();

   private int numSeguroSocial;

    public Profesor(String nombre, String cedula, int edad, String estadoCivil, List<Materia> listaMateriaAsignadas, int numSeguroSocial) {
        super(nombre, cedula, edad, estadoCivil);
        this.listaMateriaAsignadas = listaMateriaAsignadas;
        this.numSeguroSocial = numSeguroSocial;
    }

    public List<Materia> getListaMateriaAsignadas() {
        return listaMateriaAsignadas;
    }

    public void setListaMateriaAsignadas(List<Materia> listaMateriaAsignadas) {
        this.listaMateriaAsignadas = listaMateriaAsignadas;
    }

    public int getNumSeguroSocial() {
        return numSeguroSocial;
    }

    public void setNumSeguroSocial(int numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }

    @Override
    public boolean esMayorEdad(){
        return true;
    }
}
