import java.util.Random;
import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double x;

        System.out.println("Insira o valor de x: ");
        x = teclado.nextDouble();

        for (int i = 0; x > 1; i++) {
            if (x % 2 == 0){
                x = x/2;
                System.out.println(x);
            }else{
                x = 3 * x + 1;
                System.out.println(x);
            }
        }
    }
}
