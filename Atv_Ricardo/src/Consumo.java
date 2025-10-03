import java.util.Scanner;
import java.util.Locale;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int distancia;
        double combgasto, conmedio;

        System.out.print("Distancia percorrida: ");
        distancia = sc.nextInt();

        System.out.print("Combustível gasto: ");
        combgasto = sc.nextDouble();

        conmedio = (double) distancia / combgasto;

        System.out.printf("Consumo medio = %.3f%n", conmedio);

        sc.close();
    }
}