import java.util.Random;
import java.util.Scanner;


public class Reto8 {
    public static void main(String[] args) {
        //declarar variables
        int numeroComp = 0, numero = 0, intentos, intentosRes = 0, numIntentosUsu = 0;
        //instanciar la clase Scanner
        Scanner Lectura = new Scanner(System.in);
        Random Rand = new Random();
        
        numeroComp = Rand.nextInt(100) + 1;

        System.out.println("intente adivinar el numero del 1 al 100");
        System.out.println("Cuantos intentos desea intentar\n(Maximo 10)");
        numIntentosUsu = Lectura.nextInt();
        if (numIntentosUsu < 0 || numIntentosUsu > 10) {
            System.out.println("El numero de intentos es invalido");
            return;
        }
        intentosRes = numIntentosUsu;
        for(intentos = 0; intentos <= numIntentosUsu; intentos++){
            System.out.println("Digite un numero para intentar adivinar:");;
            numero = Lectura.nextInt();
            if (numero == numeroComp) {
                System.out.println("Ganaste!");
            }else{
                System.out.println("El numero que digitaste no es correcto\nvuela intentarlo:\nTe quedan " + intentosRes + " intentos");
                intentosRes = intentosRes - 1;
            }
        };
            
        System.out.println("Perdiste!\nEl número era: " + numeroComp);
        Lectura.close();
        }


    }
    
