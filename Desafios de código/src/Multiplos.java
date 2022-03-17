import java.util.Scanner;

public class Multiplos {

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int  x = leitor.nextInt();
            int y  = leitor.nextInt();
            if (x%y==0 || y%x==0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        }
}
