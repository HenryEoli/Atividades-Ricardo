import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, h, area, per, diag;

        System.out.print("Digite a base do retangulo: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        h = sc.nextDouble();
        area  = h*base;
        per = (base*2 ) + (h*2);
        diag = Math.sqrt((base*base) + (h*h));
        System.out.printf("Area do retangulo = %.2f%n ", area);
        System.out.printf("Perimetro do retangulo = %.2f%n ", per);
        System.out.printf("Diagonal do retangulo = %.2f%n ", diag);


        sc.close();

    }
    
}