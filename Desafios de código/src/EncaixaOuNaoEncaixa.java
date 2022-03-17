import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNaoEncaixa {

        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);

            int tentaivas = scan.nextInt();

            for (int i = 0; i < tentaivas; i++) {
                String A = scan.next();
                String B = scan.next();
                if (A.endsWith(B)) System.out.println("encaixa");
                else System.out.println("nao encaixa");
            }
        }
}
