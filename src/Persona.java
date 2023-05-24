public class Persona {

    private String nombre;
    private String cedula;
    private int edad;

    private String estadoCivil;

    public Persona(String nombre, String cedula, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean esMayorEdad(){
        if(edad>18){
            return true;
        }else {
            return false;
        }
    }



}
