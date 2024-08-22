package ej2tp2colaborativo;

import java.time.LocalTime;
import java.util.Scanner;
//Grupo 13
//Zegarra Juan Cruz
//Miranda Salmin Ariel Ismael
//Lucero Melina Zoé
//Ross Matias
//Orozco Miguel

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, fecha, hora, modelo;
        int edad, altura, numSerie, x, y;

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
        fecha = entrada.next();
        System.out.print("Hora con el formato (h:min): ");
        hora = entrada.next();
        System.out.print("Modelo del Reloj: ");
        modelo = entrada.next();
        System.out.print("Numero de Serie: ");
        numSerie = entrada.nextInt();

        //----------------------------------------------------------------------
        Persona datosPersona = new Persona(nombre, apellido, edad, altura, null);
        //        datosPersona.setReloj(new Reloj(hora, fecha, modelo, numSerie));

        datosPersona.setReloj(new RelojFit(hora, fecha, modelo, numSerie));
        datosPersona.getReloj().incrementarHora();
        datosPersona.getReloj().incrementarDia();
        System.out.println("\n--------------------------------------");

        datosPersona.getReloj().limpiarPantalla();
        System.out.println("\n--------------------------------------");

        //----------------------------------------------------------------------
        System.out.println("La frecuencia del reloj es: " + datosPersona.getReloj().frecuenciaAleatoria());
        System.out.println("\n--------------------------------------");

        //Desarrollar el metodo de pasos
        System.out.print("Cuantos pasos hizo hacia atras o adelante: ");
        y = entrada.nextInt();
        System.out.print("Cuantos pasos hizo hacia la izquierda o la derecha: ");
        x = entrada.nextInt();
        datosPersona.getReloj().cuentaPasos(x, y);
        //Tomamos como referencia x y como pasos hacia ciertos lados (adelante, atras, izquierda o derecha)
        //para la suma de estos y que diga una cantidad total

    }
}
