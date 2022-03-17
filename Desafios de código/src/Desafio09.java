import java.util.Scanner;

public class Desafio09 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int s;
            s = sc.nextInt();
            do {
                System.out.println("senha inválida");
                s = sc.nextInt();

            }while(s!=2002);
        System.out.println("Acesso permitido");

    }
}
