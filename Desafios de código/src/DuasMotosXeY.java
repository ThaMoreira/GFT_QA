import java.io.IOException;
import java.util.Scanner;

public class DuasMotosXeY {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int km = leitor.nextInt();
        int minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos");
    }
}

