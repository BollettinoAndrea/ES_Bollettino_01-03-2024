import java.util.Scanner;
public class Esercizio_quattro_Bollettino {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inserisci anno: ");
        int anno = scanner.nextInt();

        bisestile(anno);

        if (anno < 0) {
            System.out.println("errore");
        } else if (bisestile(anno)) {
            System.out.println("anno bisestile");
        } else {
            System.out.println("anno non bisestile");
        }
    }
    private static boolean bisestile(int anno) {
        return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0));
    }
}