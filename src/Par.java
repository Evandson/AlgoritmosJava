import java.util.Scanner;

/**
 * Created by Evandson Maranhão on 09/04/2016.
 */
public class Par {
    public static void main(String args[]) {
        String nomeJogador1,nomeJogador2, array[] = new String[1000];
        int qtdPartidas = 0, maoJogador1, maoJogador2, teste;

        Scanner sc = new Scanner(System.in);

        teste = sc.nextInt();

        while (teste > 0) {
            if (teste == 0) {
                break;
            }

            nomeJogador1 = sc.next();
            if((nomeJogador1.length()) < 1 || (nomeJogador1.length()) > 10) {
               break;
            }

            nomeJogador2 = sc.next();
            if((nomeJogador2.length()) < 1 || (nomeJogador2.length()) > 10) {
                break;
            }

            for (int i = 0; i < teste; i++) {
                maoJogador1 = sc.nextInt();
                maoJogador2 = sc.nextInt();

                if ((maoJogador1 + maoJogador2) % 2 == 0) {
                    array[i] = (nomeJogador1);
                } else {
                    array[i] = nomeJogador2;
                }
            }

            qtdPartidas++;
            System.out.println("Teste "+qtdPartidas);
            for (int i = 0; i < teste; i++) {
                System.out.println(array[i]);
            }
            System.out.println();
            teste = sc.nextInt();
        }
    }
}
