import java.util.Scanner;
import java.util.Locale;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double precouni, dinrec, vTotal, troco;
        int qtd;

        System.out.print("Preço unitário do produto: ");
        precouni = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        qtd = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        dinrec = sc.nextDouble();

        vTotal = precouni * qtd;
        troco = dinrec - vTotal;

        System.out.printf("TROCO = %.2f%n", troco);

        sc.close();
    }
}