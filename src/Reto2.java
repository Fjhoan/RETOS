import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        
        Float pesoBebe;
        double mesesBebe;
        double dosisVacuna;
        String nombreTutor;
        String nombreEnfer;

        Scanner Lectura = new Scanner(System.in);
        System.out.println("Digite el nombre del tutor legal o progenitor(a):");
        nombreTutor = Lectura.nextLine();

        System.out.println("Digite el nombre del encargado(a) de la vacunación:");
        nombreEnfer = Lectura.next();

        System.out.println("Digite el peso del bebé:");
        pesoBebe = Lectura.nextFloat();

        System.out.println("Digite los meses del bebé:");
        mesesBebe = Lectura.nextDouble();

        dosisVacuna = ((pesoBebe + 10)/(mesesBebe * 10)) * 8;

        System.out.println("El bebé pesa: " + pesoBebe + " Kg");
        System.out.println("Los meses del bebé son: " + mesesBebe);
        System.out.println("El progenitor del bebé es: " + nombreTutor);
        System.out.println("El encargado de la dósis es: " + nombreEnfer);
        System.out.println("El la dosis a aplicar es: " + dosisVacuna + " Mlg");
        
        Lectura.close();
    }
}
