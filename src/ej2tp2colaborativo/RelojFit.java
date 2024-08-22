package ej2tp2colaborativo;

public class RelojFit extends Reloj {

    public RelojFit(String hora, String dia, String modelo, long numSerie) {
        super(hora, dia, modelo, numSerie);
    }

    public void cuentaPasos(int x, int y) {

        System.out.println("Los pasos recorridos son " + (x + y));
    }

    public int frecuenciaAleatoria() {
        return (int) ((Math.random() * (100 - 80)) + 80);
    }

}
