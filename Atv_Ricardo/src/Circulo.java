import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo:");
        double r = sc.nextDouble();

        double a = Math.PI * Math.pow(r, 2);

        System.out.printf("A area do circulo e: %.3f%n", a);

        sc.close();
    }
}