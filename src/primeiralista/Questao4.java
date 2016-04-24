package primeiralista;

import java.util.Scanner;

/**
 * Created by usuario on 20/04/2016.
 */
public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextInt();

        if (salario <= 600) {
            salario = salario;
        }else if (salario > 600 && salario <= 1200){
            salario = salario - (salario * 20/100);
        }else if (salario > 1200 && salario <= 2000){
            salario = salario - (salario * 25/100);
        }else{
            salario = salario - (salario * 30/100);
        }
        System.out.println(salario);
    }
}
