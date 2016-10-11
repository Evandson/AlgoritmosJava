import java.util.Scanner;

/**
 * Created by Evandson Maranhão on 11/04/2016.
 * Teste
 */
public class Primos {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero:");
        int n = sc.nextInt();
        if(n % 1 == 0 && n % n == 0){
            System.out.println( "É Primo");
        }else{
            System.out.println("Não é Primo");
        }
    }
}
