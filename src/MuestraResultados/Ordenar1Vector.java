package MuestraResultados;

public class Ordenar1Vector implements OrdenarVector { //Implementamos la interfaz figura.

    private int menor;
    private int pos;

    public void ordena(int[] v, DatosEstadisticos de) {
        de.estableceTiempo(System.currentTimeMillis());
        for (int i = 0; i < v.length; i++) {
            menor = v[i];
            pos = i;
            for (int j = i + 1; j < v.length; j++) {
                if (menor > v[j]) {
                    menor = v[j];
                    pos = j;
                }
            }
            v[pos] = v[i];
            v[i] = menor;
            
        }
        de.estableceTiempo(System.currentTimeMillis() - de.dameTiempo()*1000);
    }

    public String nombreMetodo() {
        return "Salinter";
    }

}
