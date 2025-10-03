import java.util.Scanner;
import java.util.Locale;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double vph, pag, htrab;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Valor por hora: ");
        vph = sc.nextDouble();

        System.out.print("Horas trabalhadas: ");
        htrab = sc.nextDouble();

        pag = vph * htrab;

        System.out.printf("O pagamento para %s deve ser %.2f%n", nome, pag);

        sc.close();
    }
}