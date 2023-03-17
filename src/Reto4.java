    import java.util.Scanner;
    import java.util.Random;
    
    public class Reto4 {
    public static void main(String[] args) {
        
        int jugador, computadora;
        double valorApuesta = 0,saldoInicial = 0, saldo = 0,sumaGanada = 0,sumaPerdida = 0;
        String nomUsu;
        
        Scanner Lectura = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Bienvenido al juego de Piedra, Papel o Tijera");        
        System.out.println("Ingrese su nombre:");
        nomUsu = Lectura.next();
        System.out.println("digite el saldo a recargar: ");
        saldoInicial = Lectura.nextDouble();
        System.out.println("Digite la cantidad que quiere apostar: ");
        valorApuesta = Lectura.nextDouble();   
        System.out.println("Por favor, seleccione su opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");

        jugador = Lectura.nextInt();
     
        
        if (valorApuesta > saldoInicial) {
            System.out.println("La apuesta no puede superar a su saldo");
            return;
        }
        
        
        if (jugador < 1 || jugador > 3) {
            System.out.println("Opción inválida. Por favor seleccione 1, 2 o 3.");
            return;
        }
        
        computadora = rand.nextInt(3) + 1;

        System.out.print("La computadora seleccionó: ");

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

        if (jugador == computadora) {
            System.out.println("Empate!");
        } else if (jugador == 1 && computadora == 3 || jugador == 2 && computadora == 1 || jugador == 3 && computadora == 2) {
            System.out.println("Ganaste!");
            sumaGanada = valorApuesta * 0.2;
            valorApuesta = valorApuesta + sumaGanada;
            System.out.println("Gracias por jugar: "+ nomUsu +" Usted gano: "+ valorApuesta);        
            saldo = saldoInicial + valorApuesta;
            System.out.println("Su saldo de recarga es: " + saldo);
            System.out.println("Ganaste!");
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
    

