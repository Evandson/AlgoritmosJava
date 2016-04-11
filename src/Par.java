import java.util.Scanner;

/**
 * Created by Evandson Maranhão on 09/04/2016.
 */
public class Par {
   public static void main(String args[]) {
       int qtdPartidas = 0;
       String nomeJogador1;
       String nomeJogador2;
       int maoJogador1;
       int maoJogador2;
       int teste = 1;
       String array[] = new String[1000];
       int aux = 0;

       Scanner sc = new Scanner(System.in);

       while (teste != 0) {
               System.out.println("Quantidade de Partidas:");
               qtdPartidas = sc.nextInt();
           if (qtdPartidas == 0){
               break;
           }
               aux += qtdPartidas;

               System.out.println("Nome do Jogador1:");
               nomeJogador1 = sc.next();
               System.out.println("Nome do Jogador2:");
               nomeJogador2 = sc.next();
           for (int i = 0; i < qtdPartidas; i++) {
               {
                   System.out.println("Mão do Jogador1:");
                   maoJogador1 = sc.nextInt();
                   System.out.println("Mão do Jogador2:");
                   maoJogador2 = sc.nextInt();

                   if ((maoJogador1 + maoJogador2)% 2 == 0){
                        array[i] = nomeJogador1;
                   } else {
                        array[i] = nomeJogador2;
                   }
               }
           }
       }

       for (int i = 0; i < aux; i++){
               System.out.println(array[i]);
           }
       }
   }