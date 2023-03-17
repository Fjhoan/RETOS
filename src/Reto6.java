import java.util.Random;
import java.util.Scanner;

public class Reto6 {
    public static void main(String[] args) {
        //Declarar variables
        String nomUsu;
        int vidas = 3;
        double valorApuesta = 0, saldo = 0,sumaTotal = 0;
        int jugador; 
        int computadora;
        int numRep = 0;
        int juegosJugados = 0;
        double sumaGanada = 0;
        double sumaPerdida = 0;
        //Instanciar metodo scanner
        Scanner Lectura = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Por favor ingrese su nombre");
        nomUsu = Lectura.next();
        System.out.println("Digite el numero de veces que quieres jugar (máximo 10): ");
        numRep = Lectura.nextInt();        
        if (numRep > 10 || numRep < 0) {
            System.out.println("El numero de juegos es invalido");
            return;
        }
        System.out.println("digite el saldo a recargar: ");
        saldo = Lectura.nextDouble();
        System.out.println("digite el valor de la apuesta: ");
        valorApuesta = Lectura.nextInt();



        for( juegosJugados = 0;vidas > 0 && juegosJugados < numRep; juegosJugados++){
        
        System.out.println("Bienvenido al juego de Cara o Sello");
        System.out.println("Por favor, seleccione su opción:");
        System.out.println("1. Cara");
        System.out.println("2. Sello");

        jugador = Lectura.nextInt();

        
        if (jugador < 1 || jugador > 2) {
            System.out.println("Opción inválida. Por favor seleccione 1 o 2.");
            return;
        }

        computadora = rand.nextInt(2) + 1;

        System.out.print("La moneda cayó: ");

        switch (computadora) {
            case 1:
                System.out.println("Cara");
                break;
            case 2:
                System.out.println("Sello");
                break;
        }

        if (jugador == computadora) {
            System.out.println("Ganaste!");
            sumaGanada = valorApuesta * 0.1;
            valorApuesta = valorApuesta + sumaGanada;
            System.out.println("Usted a ganado: " + valorApuesta);
            saldo = saldo + valorApuesta;
            System.out.println("Su saldo es: " + saldo);
            System.out.println("Se han jugado: "+ juegosJugados);
            sumaTotal = sumaTotal + sumaGanada;
        } else {            
            System.out.println("Perdiste");
            sumaPerdida = valorApuesta * 0.1;
            valorApuesta = valorApuesta - sumaPerdida;
            System.out.println("Gracias por jugar: " + nomUsu + "\nUsted a perdido: " + sumaPerdida);
            vidas = vidas - 1;
            saldo = saldo - valorApuesta;
            System.out.println("Su saldo es: " + saldo);
            System.out.println("le quedan: " + vidas + " vidas");
            System.out.println("Se han jugado: "+ juegosJugados);
            sumaTotal = sumaTotal - sumaPerdida;
        }
        }
            System.out.println("Usted ha ganado o perdido: " + sumaTotal);
            Lectura.close();
        }


        
    }

