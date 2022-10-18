import java.util.Scanner;

public class GirilenSayiyaKadarOlanSayilarinUcVeDorteBolunenlerinOrtalamasi {
    public static void main(String[] args) {
        int sayi, sayac=0, toplam=0;
        float ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        sayi = input.nextInt();

        int i=0;
        while (i<=sayi) {
            if (i%3==0 && i%4==0) {
                toplam += i;
                sayac++;
            }
            i++;
        }
        ortalama = toplam / sayac;
        System.out.print("Ortalama: " +ortalama);
    }
}
