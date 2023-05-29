import java.util.Scanner;

public class entradasDeDados {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Digite seu nome: ");
       String nome= scanner.next();
       
        System.out.println("Bem-vindo " + nome);
        scanner.close();
    }
}
