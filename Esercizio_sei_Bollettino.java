import java.util.Scanner;
public class Esercizio_sei_Bollettino {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int primo, secondo;

        System.out.println("inserisci una coppia di numeri (0 per terminare): ");
        primo = in.nextInt();
        secondo = in.nextInt();

        multiplo(primo, secondo);

        while (primo != 0 && secondo != 0) {
            if(multiplo(primo, secondo)==true){
                System.out.println(secondo + " e' un multiplo di " + primo + ".");
            }else{
                System.out.println(secondo + " non e' un multiplo di " + primo + ".");
            }
            System.out.println("inserisci una coppia di numeri (0 per terminare): ");
            primo = in.nextInt();
            secondo = in.nextInt();
        }
    }

    private static boolean multiplo(int primo, int secondo) {
        return secondo % primo == 0;
    }
}