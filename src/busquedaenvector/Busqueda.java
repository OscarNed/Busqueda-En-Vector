package busquedaenvector;
import java.util.Scanner;

/**
 *
 * @author OscarNedzelsky A00513376
 */
public abstract class Busqueda {
    //Atributos
    protected int num;
    protected int [] vector;
    
    public static int [] setVector(){//Este método crea el vector y le introduce los valores.
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclee la longitud que desea que tenga su vector:"); //Se le pide al usuario que teclee la longitud del vector.
        int lgt = scan.nextInt();
        int vector [] = new int [lgt]; //Se crea el vector con la longitud especificada.
        for (int i = 0; (i < lgt); i++){ //El ciclo permite que el usuario llene el vector.
            System.out.println("Teclee el valor que ocupará la posición " + (i + 1) + ":");
            int valor = scan.nextInt();
            vector [i] = valor;
        }
        return vector; //Una vez que el vector fue creado, es regresado para modificarlo.
    }
    
    public static void getVector(int [] vector){ //Este método muestra el vector.
        System.out.println("\nSu vector es el siguiente:");
        for (int i = 0; (i < vector.length); i++){
            System.out.print("[" + vector [i] + "] ");
        }
        System.out.println("");
    }
    
    public static void mostrarVector(int [] vector){ //Este método y el método getVector son básicamente lo mismo, así que este método llama al segundo.
        Busqueda.getVector(vector);
    }
    
    public static int solicitarElementoDeBusqueda(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclee el número que desea buscar:");
        int num = scan.nextInt();
        return num;
    }
    
    public static void mostrarResultado(int num, int posicion){
        if (posicion == -1){
            System.out.println("El número no fue encontrado en el vector.\n");
        } else {
            System.out.println("El número " + num + " fue encontrado en la posición " + posicion + " del vector.\n");
        }        
    }
    
    abstract int Buscar(int vector []);
}
