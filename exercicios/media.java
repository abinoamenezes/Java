package exercicios;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("digite um numero: ");
        int number= scanner.nextInt();
        scanner.nextLine();
        int contador=1;

        String answer="sim";
        while (answer.equals("sim")) {
            System.out.print("Voçê quer digitar outro número?(sim/nao) ");
            answer= scanner.nextLine();
            if (!answer.equals("sim") && !answer.equals("nao")) {
                System.out.println("Responda com (sim ou nao) ");
                System.out.print("Voçê quer digitar outro número?(sim/nao) ");
                answer= scanner.nextLine();
            }
            if (answer.equals("nao")) {
                answer="nao";
                break;
            }
            
          
              System.out.print("Digite outro número ");
             number= number + scanner.nextInt();
             scanner.nextLine();
             contador+=1;
           
        }   
          float media= (float) number/contador;
          System.out.printf(" A média dos números que voçê digitou é: %f%n", media);
          scanner.close();
    }
    

}
