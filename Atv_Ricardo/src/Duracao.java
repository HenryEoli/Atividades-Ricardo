import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int duremsegs;
        int h, min, seg;

        System.out.print("Digite a duracao em segundos: ");
        duremsegs = sc.nextInt();

        h = duremsegs / 3600; 
        
        int resto = duremsegs % 3600; 
        
        min = resto / 60;
        
        seg = resto % 60; 

        System.out.printf("%d:%d:%d%n", h, min, seg);

        sc.close();
    }
}