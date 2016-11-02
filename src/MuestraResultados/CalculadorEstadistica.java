/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MuestraResultados;

public class CalculadorEstadistica {

    public static DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector m, int tam_vector) {
        DatosEstadisticos[] devolver = new DatosEstadisticos[2];
        Ordenar1Vector ordenar = new Ordenar1Vector();
        DatosEstadisticos de = new DatosEstadisticos();

        int[] inverso = GeneraCaso.generaVector(tam_vector, false);
        ordenar.ordena(inverso, de);
        devolver[0] = de;

        int[] aleatorio = GeneraCaso.generaVector(tam_vector, true);
        double tiempo = 0.0;
        DatosEstadisticos a = new DatosEstadisticos();
        for (int j = 0; j < 10; j++) { //10 CALCULAR ALEATORIAS
            ordenar.ordena(aleatorio, de);
            a.añadeTiempo(de.dameTiempo());
        }
        a.estableceTiempo(a.dameTiempo() / 10);
        devolver[1] = a;

        //CALCULAR LA MEDIA DE LOS ALEATORIOS.
        return devolver;
    }

    public static DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[][] devolver = new DatosEstadisticos[6][3];
        DatosEstadisticos[] pasar = new DatosEstadisticos[2];
        DatosEstadisticos cosa = new DatosEstadisticos();
        
        for (int i = 0; i < tam_vectores.length; i++) {
            cosa.estableceTiempo(tam_vectores[i]);
            devolver[i][0]=cosa;
            devolver[i][1]=estadisticaOrdenaVector(m,tam_vectores[i])[0];
            devolver[i][2]=estadisticaOrdenaVector(m,tam_vectores[i])[1];
            
        }
         
        /*for (int i = 0; i < 6; i++) {
            
            pasar = estadisticaOrdenaVector(m, tam_vectores[i]);
            /*
            cosa.estableceTiempo(tam_vectores[i]);
            System.out.println(tam_vectores[i]);
            devolver[i][0] = cosa;
            //System.out.println(devolver[i][0].dameTiempo());
            devolver[i][1] = pasar[0];
            devolver[i][2] = pasar[1];
            
            //System.out.println(pasar[0].dameTiempo());
            //System.out.println(pasar[1].dameTiempo());
            
        }*/

/*
devolver[0][1] = pasar[0];
devolver[0][2] = pasar[1];
*/



        return devolver;
        
        /**
        DatosEstadisticos[][] result = new DatosEstadisticos[tam_vectores.length][2];
        for(int i =0; i<tam_vectores.length;i++){
            result[i]=estadisticaOrdenaVector(m,tam_vectores[i]);
            System.out.println(result[i].dameTiempo);
        }
        return result;
       **/

    }
}
