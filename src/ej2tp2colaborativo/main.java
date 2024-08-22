package ej2tp2colaborativo;

import java.time.LocalTime;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, fecha, hora, modelo;
        int edad, altura, numSerie;
        
        //----------------------------------------------------------------------
        System.out.println("--------------------------------------");
        System.out.println("Digite los datos de una persona");
        System.out.print("Nombre: ");
        nombre = entrada.next();
        System.out.print("Apellido: ");
        apellido = entrada.next();
        System.out.print("Edad: ");
        edad = entrada.nextInt();
        System.out.print("Altura (en cm): ");
        altura = entrada.nextInt();
        
        //----------------------------------------------------------------------
        System.out.println("\n--------------------------------------");
        System.out.println("Acontinuacion digite los datos de reloj");
        System.out.print("Fecha con el formato (yyyy-mm-dd): ");
        fecha=entrada.next();
        System.out.print("Hora con el formato (h:min): ");
        hora=entrada.next();
        System.out.print("Modelo del Reloj: ");
        modelo = entrada.next();
        System.out.print("Número de Serie: ");
        numSerie = entrada.nextInt();
        
        //----------------------------------------------------------------------
        Persona datosPersona = new Persona(nombre, apellido, edad, altura);
        datosPersona.setReloj(new RelojFij(hora, fecha, modelo, numSerie));
        datosPersona.getReloj().incrementarHora();
        datosPersona.getReloj().incrementarDia();
        datosPersona.getReloj().limpiarPantalla();
        
        //----------------------------------------------------------------------
        //Crear un objeto de tipo <Reloj> que almacenara los datos asociados a la clase <Persona>
        Reloj reloj = datosPersona.getReloj();
        
        //Ver si <reloj> es de tipo <RelojFij>
        if (reloj instanceof RelojFij){
            //Crea un objeto de tipo <RelojFij> para poder llamar sus metodos
            RelojFij relojFij = (RelojFij) reloj;
            System.out.println("La frecuencia del reloj es: "+relojFij.frecuenciaAleatoria());
            
            //Desarrollar el metodo
            //relojFij.cuentaPasos(edad, edad);
            
        }
        
        
        
    }
}
