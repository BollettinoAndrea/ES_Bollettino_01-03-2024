import java.util.Scanner;
public class Esercizio_sette_Bollettino {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci tre interi (cateto1 cateto2 ipotenusa): ");

        System.out.println(" ");

        System.out.println("inserisci cateto1: ");
        int a = in.nextInt();

        System.out.println(" ");

        System.out.println("inserisci cateto2: ");
        int b = in.nextInt();

        System.out.println(" ");

        System.out.println("inserisci ipotenusa: ");
        int c = in.nextInt();

        TernaPitagorica(a, b, c);

        if(TernaPitagorica(a, b, c)==true){
            System.out.println("i numeri inseriti formano una terna pitagorica. ");
        }else{
            System.out.println("i numeri inseriti NON formano una terna pitagorica. ");
        }

    }

    private static boolean TernaPitagorica(int a, int b, int c) {
        return a*a + b*b == c*c;
    }
}