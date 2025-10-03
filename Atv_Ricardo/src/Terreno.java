import java.util.Scanner;
import java.util.Locale;

public class Terreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double larg, comp, vmq;
        
        double area, preco;

        System.out.print("Digite a largura do terreno: ");
        larg = sc.nextDouble();

        System.out.print("Digite o comprimento do terreno: ");
        comp = sc.nextDouble();

        System.out.print("Digite o valor do metro quadrado: ");
        vmq = sc.nextDouble();

        area = larg * comp;
        preco = area * vmq;

        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Preco do terreno = %.2f%n", preco);
        
        sc.close();
    }
}