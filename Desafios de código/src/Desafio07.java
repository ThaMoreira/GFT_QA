import java.util.Scanner;

public class Desafio07 {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            int inicio = leitor.nextInt();
            int fim = leitor.nextInt();

            if (inicio >= 0 && fim <= 2) {
                System.out.println("nova");
            }
            else if (inicio >= 3 && fim <= 96 && inicio<fim) {
                System.out.println("crescente");
            }
            else if (fim <= 100 && inicio<fim) {
                System.out.println("cheia");
            }
            else {
                System.out.println("minguante");
            }

        }
}
