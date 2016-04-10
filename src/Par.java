import java.util.Scanner;

/**
 * Created by Evandson Maranhão on 09/04/2016.
 */
public class Par {
   public static void main(String args[]) {
       int qtdPartidas = 1;
       String nomeJogador1;
       String nomeJogador2;
       int maoJogador1;
       int maoJogador2;
       int n = 1;

       Scanner sc = new Scanner(System.in);

       while (n != 0) {
               qtdPartidas = sc.nextInt();
               nomeJogador1 = sc.next();
               nomeJogador2 = sc.next();
           for (int i = 1; i <= qtdPartidas; i++) {
               {
                   System.out.println("Mão Jogador1:");
                   maoJogador1 = sc.nextInt();
                   System.out.println("Mão Jogador2:");
                   maoJogador2 = sc.nextInt();
               }

           }
           System.out.println("sair?");
           n = sc.nextInt();
           }
       }
   }

