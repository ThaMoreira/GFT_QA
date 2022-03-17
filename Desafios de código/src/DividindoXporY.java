import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DividindoXporY {

        public static void main(String[] args) throws IOException {
            Scanner leitor = new Scanner(System.in);
            int N = leitor.nextInt();
            float X, Y;
            for (int i = 0; i < N; i++) {
                X = leitor.nextFloat();
                Y = leitor.nextFloat();
                if (Y == 0) System.out.println("divisao impossivel");
                else System.out.printf("%.1f\n", X / Y);
            }
        }
    }
