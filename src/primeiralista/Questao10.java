package primeiralista;

import java.util.Scanner;

/**
 * Created by usuario on 20/04/2016.
 */
public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intervalo = 0;
        int fora = 0;

        for (int i = 0; i <= 10; i++){
            int n = sc.nextInt();
            if (n >= 10 && n <= 50){
                intervalo +=1;
            } else {
                fora +=1;
            }
        }
        System.out.println(" No intervalo: "+intervalo+"\n Fora do intervalo: "+fora);
    }
}
