import java.util.Random;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        double numPontoCirculo = 0;
        double numPontoTotal = 0;
        double estimado;
        double x, y, distancia, pi;
        Scanner teclado = new Scanner(System.in);
        Random R = new Random();

        System.out.println("Número estimado de pontos: ");
        estimado = teclado.nextInt();

        for (int i = 0; i < estimado; i++) {
            x = R.nextDouble();
            y = R.nextDouble();
            distancia = Math.pow(x,2) + Math.pow(y,2);
            if (distancia <= 1){
                numPontoCirculo = numPontoCirculo+1;
            }
            numPontoTotal = numPontoTotal + 1;
        }

        pi = (4*numPontoCirculo) / numPontoTotal;
        System.out.println(pi);

        teclado.close();
    }
}
