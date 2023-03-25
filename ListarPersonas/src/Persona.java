public class Persona {

    private String nombre;
    private String apellido;

    // Constructor de la clase Persona
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getter para el atributo nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el atributo apellido
    public String getApellido() {
        return apellido;
    }

    // Setter para el atributo apellido
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

