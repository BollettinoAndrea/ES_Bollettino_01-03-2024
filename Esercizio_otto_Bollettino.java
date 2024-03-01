import java.util.Scanner;
public class Esercizio_otto_Bollettino {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("inserisci il valore dei due cateti: ");

        System.out.println(" ");

        System.out.println("inserisci cateto1: ");
        double cateto1 = in.nextDouble();

        System.out.println(" ");

        System.out.println("inserisci cateto2: ");
        double cateto2 = in.nextDouble();

        ipotenusa(cateto1, cateto2);

        System.out.println("L'ipotenusa è: " + ipotenusa(cateto1, cateto2));
    }

    private static double ipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
    }
}