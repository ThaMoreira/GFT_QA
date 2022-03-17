import java.io.IOException;
import java.util.Scanner;

public class KageBunshinNoJutsu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int N = sc.nextInt();
            if(N%2==0){
                System.out.println((N/2));
            }
            else{
                System.out.println((N-1));
            }
        }

        sc.close();
    }
}


