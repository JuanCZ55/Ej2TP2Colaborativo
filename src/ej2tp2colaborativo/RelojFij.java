
package ej2tp2colaborativo;


public class RelojFij extends Reloj{
    
    public RelojFij(String hora, String dia, String modelo, long numSerie) {
        super(hora, dia, modelo, numSerie);
    }
    
    public void cuentaPasos(int x, int y){
        
    }
    public double frecuenciaAleatoria(){
        return ((Math.random()*(4-2.5))+2.5);
    }
    
}
