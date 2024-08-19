
package ej2tp2colaborativo;

public class Reloj {
    private String hora, dia, modelo;
    private long numSerie;

    public Reloj(String hora, String dia, String modelo, long numSerie) {
        this.hora = hora;
        this.dia = dia;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }
    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }
    
    public void limpiarPantalla(){
        System.out.println("Pantalla Limpia");
    }
    public void incrementarHora(){
        System.out.println("incrementar una hora ");
    }
    public void incrementarDia(){
        System.out.println("Incrementar Dia");
    }
}
