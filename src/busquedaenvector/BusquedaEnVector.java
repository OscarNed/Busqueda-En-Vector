package busquedaenvector;
import java.util.Scanner;

/**
 * @author OscarNedzelsky A00513376
 */
public class BusquedaEnVector {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int posicion = 0;
        int vector [] = Busqueda.setVector();
        int num = Busqueda.solicitarElementoDeBusqueda();
        int opcion = 0;
        do{ //Este es el menú principal del programa.
            System.out.println("Presione 1 si desea realizar una búsqueda secuencial.");
            System.out.println("Presione 2 si desea realizar una búsqueda binaria.");
            System.out.println("Presione 3 si desea mostrar su vector.");
            System.out.println("Presione 4 si desea salir.");
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    Secuencial bsec = new Secuencial(num);//Crea un objeto secuencial.
                    posicion = bsec.Buscar(vector);//Inicia el método buscar, el cual regresa la posicion del número que se está buscando.
                    Busqueda.mostrarResultado(num, posicion);//Una vez que el método anterior regresó la posición, está se manda al método mostrarResultado para que la imprima en pantalla.
                    break;
                case 2:
                    Binaria bbin = new Binaria(num);//Crea un objeto binaria.
                    posicion = bbin.Buscar(vector);//Inicia el método buscar, el cual regresa la posicion del número que se está buscando.
                    Busqueda.mostrarResultado(num, posicion);//Una vez que el método anterior regresó la posición, está se manda al método mostrarResultado para que la imprima en pantalla.
                    break;
                case 3:
                    Busqueda.mostrarVector(vector);//Inicializa el método mostrarVector.
                    break;
            }
        } while (opcion == 1 || opcion == 2 || opcion == 3); //Mientras el usuario teclee una de las primeras tres opciones, seguirá retornando al menpu principal. Si oprime 4 se termina el programa.
        
    }
    
}
