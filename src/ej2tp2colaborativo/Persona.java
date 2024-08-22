
package ej2tp2colaborativo;


public class Persona {
  private String nombre, apellido;
  private int edad, altura;
  private RelojFit reloj;

    public Persona(String nombre, String apellido, int edad, int altura, RelojFit reloj) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public RelojFit getReloj() {
        return reloj;
    }

    public void setReloj(RelojFit reloj) {
        this.reloj = reloj;
    }

   
    
   
    
    
}
