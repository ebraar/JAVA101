import java.util.Scanner;

public class UsHesaplama {
    public static void main(String[] args) {
        int sayi, us, i, sonuc=1;
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayi giriniz: ");
        sayi = input.nextInt();

        System.out.print("bir üs giriniz: ");
        us = input.nextInt();

        for(i=1; i<=us; i++){
            sonuc = sonuc * sayi;
        }
        System.out.print("Sonucunuz: "+sonuc);
    }
}
