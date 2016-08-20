package busquedaenvector;

/**
 *
 * @author OscarNedzelsky A00513376
 */

public class Secuencial extends Busqueda{
    public Secuencial(int num){
        this.num = num;
    }
    @Override
    public int Buscar(int [] vector){
       int posicion = -1;
        for (int i = 0; i < vector.length; i++){
           if (num == vector [i]){
               posicion = i + 1;
           }
       }
        return posicion;
    }
}
