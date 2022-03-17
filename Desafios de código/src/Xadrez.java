import java.util.Scanner;

public class Xadrez {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int L = sc.nextInt();
            int C = sc.nextInt();
            if ((L%2!=0)&& (C%2!=0)) //se as casas são ambas ímpares
                System.out.println("1"); //branco
            else
                System.out.println("0"); //preto
            sc.close();

        }
}
