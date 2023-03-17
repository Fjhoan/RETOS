import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        
        int preCalentado = 0;
        float gradosCent;
        float gradosKel;
        Scanner Lectura = new Scanner(System.in);
        
        System.out.println("Digite los grados para precalentar el horno (Fahrenheit):");
        preCalentado = Lectura.nextInt();

        gradosKel = ((preCalentado - 32) * 5/9 + 273.15f);
        gradosCent = ((preCalentado - 32) / 1.8f);
        System.out.println("Debe precalentar el horno a: " + gradosCent + "C°" + " O " + gradosKel + "K°");
        Lectura.close();

        
    }
    
}