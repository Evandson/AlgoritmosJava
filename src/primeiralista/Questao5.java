package primeiralista;

import java.util.Scanner;

/**
 * Created by usuario on 20/04/2016.
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 1-VATAPA \n 2-PIZZA \n 3-MACARRONADA \n 4-FEIJOADA");
        int esc = sc.nextInt();

        switch (esc) {
            case 1:
                System.out.println("R$ 150.00");
                break;
            case 2:
                System.out.println("R$ 100.00");
                break;
            case 3:
                System.out.println("R$ 50.00");
                break;
            case 4:
                System.out.println("R$ 1.00");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
