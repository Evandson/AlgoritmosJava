package primeiralista;

import java.util.Scanner;

/**
 * Created by usuario on 18/04/2016.
 */
public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        if (n1 == n2) {
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
    }
}
