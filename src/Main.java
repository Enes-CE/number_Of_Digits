import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int basamak = 0;
        System.out.println("Lütfen sayinizi giriniz:");
        int sayi = klavye.nextInt();
        while (sayi > 0 || sayi < 0) {
            int kalan = sayi % 10;
            sayi = (sayi - kalan) / 10;
            basamak++;
        }
        System.out.println("Basamak sayisi= " + basamak);

    }
}
