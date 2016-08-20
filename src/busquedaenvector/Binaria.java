package busquedaenvector;

/**
 *
 * @author OscarNedzelsky A00513376
 */

public class Binaria extends Busqueda{
    public Binaria(int num){
        this.num = num;
    }
    
    @Override
    public int Buscar (int [] vector){
        int inicio = 0, fin = vector.length, centro, posicion = -1;
        while (inicio < fin){
            centro = ((inicio + fin) / 2);
            if (centro == inicio){
                centro = centro + 1;
            }
            if (vector[centro] == num){
                posicion = centro + 1;
                inicio = fin + 1;
            } else {
                if (num < vector[centro]){
                    fin = centro;
                } else {
                    inicio = centro;
                }
            }
        }
        return posicion;
    }
}
