
package ej2tp2colaborativo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Reloj {
    private String hora, dia, modelo;
    private long numSerie;
    private Scanner entrada;

    public Reloj(String hora, String dia, String modelo, long numSerie) {
        this.hora = hora;
        this.dia = dia;
        this.modelo = modelo;
        this.numSerie = numSerie;
        entrada = new Scanner(System.in);
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
        LocalDate auxDia = LocalDate.parse(dia);
        LocalTime auxHora = LocalTime.parse(hora);
        LocalDateTime fechaHora = LocalDateTime.of(auxDia, auxHora);
        //----------------------------------------------------------------------
        //Ingresar los valores a incrementar de la hora y a su vez incrementarla
        System.out.println("\n--------------------------------------");
        System.out.println("Digite los acontinuacion en cuanto desea incrementar los datos del tiempo");
        System.out.print("Hora: ");
        fechaHora = fechaHora.plusHours(entrada.nextInt());
        System.out.print("Minuto: ");
        fechaHora = fechaHora.plusMinutes(entrada.nextInt());
        
        //----------------------------------------------------------------------
        //Separar el LocalDate y el LocalTime de LocalDateTime (por cuestion de estetia al mostrar por pantalla)
        LocalDate newFecha = fechaHora.toLocalDate();
        LocalTime newHora = fechaHora.toLocalTime();
        
        //----------------------------------------------------------------------
        System.out.println("Nueva fecha: " + newFecha);
        System.out.println("Nueva hora: " + newHora);
        
        //----------------------------------------------------------------------
        dia = newFecha.toString();
        hora = newHora.toString();
        
    }
    public void incrementarDia(){
        LocalDate auxDia = LocalDate.parse(dia);
        
        //----------------------------------------------------------------------
        //Ingresar los valores a incrementar de la fecha y a su vez incrementarla
        System.out.println("\n--------------------------------------");
        System.out.println("Digite los acontinuacion en cuanto desea incrementar los datos de la fecha");
        System.out.print("Dia: ");
        auxDia = auxDia.plusDays(entrada.nextInt());
        System.out.print("Mes: ");
        auxDia = auxDia.plusMonths(entrada.nextInt());
        System.out.print("Anio: ");
        auxDia = auxDia.plusYears(entrada.nextInt());
        
        //----------------------------------------------------------------------
        System.out.println("Fecha incrementada: "+auxDia);
        
        //----------------------------------------------------------------------
        dia= auxDia.toString();
    }
}
