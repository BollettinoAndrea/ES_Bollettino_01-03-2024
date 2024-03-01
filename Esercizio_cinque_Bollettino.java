import java.util.Scanner;
public class Esercizio_cinque_Bollettino {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("inserisci un numero (0 per terminare): ");
        int num = in.nextInt();

        Pari(num);

        while (num != 0) {
            if(Pari(num)==true){
                System.out.println(num + " e' " + "pari. ");
            }else{
                System.out.println(num + " e' " + "dispari. ");
            }
            System.out.print("inserisci un numero (0 per terminare): ");
            num = in.nextInt();
        }
    }

    private static boolean Pari(int num) {
        return num % 2 == 0;
    }
}