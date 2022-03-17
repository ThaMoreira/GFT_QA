import java.util.Scanner;

public class Desafio11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] TOPS = {1, 3, 5, 10, 25, 50, 100};
        int N = scan.nextInt();
        if(N==1){
            System.out.println("Top "+ TOPS[0]);
        }
        else if(N>1 && N<=3){
            System.out.println("Top "+ TOPS[1]);
        }
        else if(N>1 && N<=3){
            System.out.println("Top "+ TOPS[2]);
        }
        else if(N>3 && N<=10){
            System.out.println("Top "+ TOPS[3]);
        }
        else if(N>10 && N<=25){
            System.out.println("Top "+ TOPS[4]);
        }
        else if(N>25 && N<=50){
            System.out.println("Top "+ TOPS[5]);
        }
        else{
            System.out.println("Top "+ TOPS[6]);
        }
