package primeiralista;

import java.util.Scanner;

/**
 * Created by usuario on 20/04/2016.
 */
public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fat = 1;
        int n = sc.nextInt();

        for(int i = 1;i <= n; i++){
            fat = fat * i;
        }
        System.out.println(fat);
    }
}
