import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        //Declarar variables
        String nomUsu;
        int vidas = 3;
        double valorApuesta = 0, saldoInicial = 0, sumaTotal = 0;
        int jugador; 
        int computadora;
        int numRep = 0;
        int juegosJugados = 0;
        double sumaGanada = 0;
        double sumaPerdida = 0;
        //Instanciar metodo scanner y random
        Scanner Lectura = new Scanner(System.in);
        Random rand = new Random();
//solicitar datos
        System.out.println("Por favor ingrese su nombre");
        nomUsu = Lectura.nextLine();
        System.out.println("Digite el numero de veces que quieres jugar (máximo 10): ");
        numRep = Lectura.nextInt();        
        if (numRep > 10 || numRep < 0) {
            System.out.println("El numero de juegos es invalido");
            return;
        }
        System.out.println("digite el saldo a recargar: ");
        saldoInicial = Lectura.nextDouble();
        System.out.println("digite el valor de la apuesta: ");
        valorApuesta = Lectura.nextDouble();



        for( juegosJugados = 0;vidas > 0 && juegosJugados < numRep; juegosJugados++) {
        
   
        System.out.println("Por favor, seleccione su opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
    
        jugador = Lectura.nextInt();

//poner la condicion de que si no escoge una de la opciones n puede seguir 
        if (jugador < 1 || jugador > 3) {
            System.out.println("Opción inválida. Por favor seleccione 1, 2 o 3.");
            return;
        }
//darle un valor entero a la maquina      
        computadora = rand.nextInt(3) + 1;

        System.out.print("La computadora seleccionó: ");
//poner los casos de las opciones de la maquina
        switch (computadora) {
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Papel");
                break;
            case 3:
                System.out.println("Tijera");
                break;
        }
// imponer la condicion de ganar o perder
        if (jugador == computadora) {
            System.out.println("Empate!");
        } else if (jugador == 1 && computadora == 3 || jugador == 2 && computadora == 1 || jugador == 3 && computadora == 2) {
            System.out.println("Ganaste!");
            sumaGanada = valorApuesta * 0.1;
            valorApuesta = valorApuesta + sumaGanada;
            System.out.println("Usted a ganado: " + valorApuesta);
            saldoInicial = saldoInicial + valorApuesta;
            System.out.println("Su saldo es: " + saldoInicial);
            System.out.println("Se han jugado: "+ juegosJugados);
            sumaTotal = sumaTotal + sumaGanada;
        } else {
            System.out.println("Perdiste");
            sumaPerdida = valorApuesta * 0.1;
            valorApuesta = valorApuesta - sumaPerdida;
            System.out.println("Gracias por jugar: " + nomUsu + "\nUsted a perdido: " + sumaPerdida);
            vidas = vidas - 1;
            saldoInicial = saldoInicial - valorApuesta;
            System.out.println("Su saldo es: " + saldoInicial);
            System.out.println("le quedan: " + vidas + " vidas");
            System.out.println("Se han jugado: " + juegosJugados);
            sumaTotal = sumaTotal - sumaPerdida;
        }
            

    }
        System.out.println("Usted ha ganado o perdido: " + sumaTotal);
        Lectura.close();
    }
}
    
