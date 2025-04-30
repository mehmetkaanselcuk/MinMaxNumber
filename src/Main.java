import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int sayiAdedi = sc.nextInt();

        int c = 1;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        do {
            System.out.print("Type"+c+"th number :");
            int sayi = sc.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

            c++;
        } while (c <= sayiAdedi);

        System.out.println("The greatest number: " + enBuyuk);
        System.out.println("The smallest number: " + enKucuk);
    }
}
