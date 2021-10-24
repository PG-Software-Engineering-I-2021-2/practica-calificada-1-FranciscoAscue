package examen;

public class Estudiante {
    String nombre;
    String apellido;
    String email;
    int celular;

    public Estudiante( String nombre, String apellido, String email, int celular){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email  = email;
        this.celular = celular;
    }

    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public int getCelular(){
        return celular;
    }
}
