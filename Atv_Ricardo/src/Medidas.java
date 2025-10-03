import java.util.Scanner;
import java.util.Locale;

public class Medidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        double areaqua, aretri, areatrap;

        System.out.print("Digite a medida A: ");
        a = sc.nextDouble();

        System.out.print("Digite a medida B: ");
        b = sc.nextDouble();

        System.out.print("Digite a medida C: ");
        c = sc.nextDouble();

        areaqua = a * a; 
        aretri = (a * b) / 2.0; 
        areatrap = ((a + b) * c) / 2.0; 

        System.out.printf("AREA DO QUADRADO = %.4f%n", areaqua);
        System.out.printf("AREA DO TRIANGULO = %.4f%n", aretri);
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", areatrap);

        sc.close();
    }
}