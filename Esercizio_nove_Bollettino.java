import java.util.Scanner;
public class Esercizio_nove_Bollettino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci il primo numero: ");
        double num1 = scanner.nextDouble();

        System.out.print(" ");

        System.out.print("inserisci il secondo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print(" ");

        System.out.print("inserisci il terzo numero: ");
        double num3 = scanner.nextDouble();

        trovaMinimo(num1, num2, num3);

        double minimo = trovaMinimo(num1, num2, num3);
        System.out.println("il numero minore tra " + num1 + ", " + num2 + ", e " + num3 + " è: " + minimo);
    }

    private static double trovaMinimo(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}