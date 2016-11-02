package MuestraResultados;

public class DatosEstadisticos {

    private double tiempo;

    // Constructor por omisión
    public DatosEstadisticos() {
    //    tiempo = 0.0;
    }

    // Incrementa el tiempo en segundos, pasado por parámetro
    public void añadeTiempo(double tiempoParametro) {
        tiempo = tiempoParametro - tiempo;
    }

    // Establece el tiempo, pasado por parámetro
    public void estableceTiempo(double establecerTiempo) {
        tiempo = establecerTiempo;
    }

    // Retorna el tiempo
    public double dameTiempo() {
        return tiempo/1000;
    }

}
