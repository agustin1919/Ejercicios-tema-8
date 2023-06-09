public class Main {
    public static void main(String[] args) {
        //Crear clase Persona.
        //Crear variables las privadas edad, nombre y telefono de la clase Persona.
        //Crear gets y sets de cada propiedad.
        //Crear un objeto persona en el main.
        //Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        // por último muéstralas por consola.

        Persona persona = new Persona();
        persona.setNombre("Facundo");
        persona.setEdad(23);
        persona.setTelefono(1140804114);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}
class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}