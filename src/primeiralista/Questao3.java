package primeiralista;

import java.util.Scanner;

/**
 * Created by usuario on 18/04/2016.
 */
public class Questao3 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();

    double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    System.out.println(distancia);
    }
}