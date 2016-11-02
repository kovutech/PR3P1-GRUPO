package MuestraResultados;

class MuestraResultados {

    public static void main(String[] programacion3) {

        int[] tamaño = {1000,2000,4000,8000,16000,32000};
        DatosEstadisticos[][] matriz = new DatosEstadisticos[tamaño.length][3];
        Ordenar1Vector cosa = new Ordenar1Vector();
        matriz = CalculadorEstadistica.estadisticasOrdenaVectores(cosa,tamaño);
        
        //System.out.println(matriz[0][0].dameTiempo());
        
        for (int i = 0; i < 6; i++) {
                System.out.println("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j].dameTiempo() + "    " );
            }
        }
    }

}
