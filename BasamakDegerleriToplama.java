import java.util.Scanner;

public class BasamakDegerleriToplama {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: ");

        sayi = input.nextInt();

        int basSayi=0, tempSayi=sayi, basValue, sonuc=0;

        while(tempSayi!=0){
            tempSayi= tempSayi / 10;
            basSayi++;
        }
        tempSayi = sayi;

        while(tempSayi!=0){
            basValue = tempSayi%10;
            tempSayi/=10;
            sonuc= sonuc + basValue;
        }
        System.out.print("basamak değerleri toplamı: "+sonuc);
    }
}
