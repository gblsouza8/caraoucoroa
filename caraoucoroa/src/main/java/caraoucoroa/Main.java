package caraoucoroa;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de vezes que deseja jogar: ");
        int vezes = input.nextInt();

        int qtd;
        int cara = 0;
        int coroa = 0;

        for (qtd = 0; qtd < vezes; qtd++){

            Random nAleatorio = new Random();
            int numeroAleatorio = nAleatorio.nextInt(1, 3);
            if (numeroAleatorio == 1)
            {
                cara += 1;
            } else {
                coroa += 1;
            }
        }
        System.out.println("Quantidade de caras: " + cara + " Quantidade de coroas: " + coroa);
    }
}