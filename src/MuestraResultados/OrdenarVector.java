package MuestraResultados;

public interface OrdenarVector {

    /**
     * ************************************************************************************************************
     * + La función nombreMetodo, devuelve el nombre de la función, en nuestro
     * caso Salinter.
     * *************************************************************************************************************
     */
    public String nombreMetodo();

    /**
     * *************************************************************************************************************
     * + El proceso Selinter, denominada Ordena, ordena un vector de enteros,
     * además almacena en la variable de, el tiempo empleado en la ejecución.
     *
     * + Parámetros: -v[]: Vector con los correspondientes elementos, enteros.
     * -de: Objeto de DatosEstadísticos, cuya función es almacenar la
     * estadística de ejecución.
     *
     **************************************************************************************************************
     */
    public void ordena(int[] v, DatosEstadisticos de);

}
