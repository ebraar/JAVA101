import java.util.Scanner;

public class HarmonikSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double toplam=0, seri=0;

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        for(int i=1; i<=sayi; i++){
            seri = (1.0 / i);
            toplam = toplam + seri;
        }
        System.out.print(toplam);
    }
}
