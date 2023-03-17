import java.util.Random;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        //
        double valorApuesta = 0;
        double saldoInicial;
        double saldo;
        int jugador; 
        int computadora;
        String nomUsu;
        double sumaGanada = 0;
        double sumaPerdida = 0;

        Scanner Lectura = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Bienvenido al juego de Cara o Sello");
        System.out.println("Ingrese su nombre:");
        nomUsu = Lectura.next();
        System.out.println("digite el saldo a recargar: ");
        saldoInicial = Lectura.nextDouble();
        System.out.println("Digite la cantidad que quiere apostar: ");
        valorApuesta = Lectura.nextDouble();        
        
        if (valorApuesta > saldoInicial) {
            System.out.println("La apuesta no puede superar a su saldo");
            Lectura.close();
            return;
        }
        
        System.out.println("Por favor, seleccione su opción:");
        System.out.println("1. Cara");
        System.out.println("2. Sello");

        jugador = Lectura.nextInt();



        if (jugador < 1 || jugador > 2) {
            System.out.println("Opción inválida. Por favor seleccione 1 o 2.");
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
            sumaGanada = valorApuesta * 0.2;
            valorApuesta = valorApuesta + sumaGanada;
            System.out.println("Gracias por jugar: "+ nomUsu +" Usted gano: "+ valorApuesta);        
            saldo = saldoInicial + valorApuesta;
            System.out.println("Su saldo de recarga es: " + saldo);

        } else {
            System.out.println("Perdiste");
            sumaPerdida = valorApuesta * 0.1;
            valorApuesta = valorApuesta - sumaPerdida;
            System.out.println("Gracias por jugar: " + nomUsu + " Usted a perdido: " + valorApuesta);
            saldo = saldoInicial - valorApuesta;
            System.out.println("Su saldo de recarga es: " + saldo);
        }

        
        
        Lectura.close();
        

        
    }
}
    

