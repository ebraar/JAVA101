import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        int sayi1, sayi2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1)TOPLAMA\n2)ÇIKARMA\n3)ÇARPMA\n4)BÖLME");
        System.out.print("Seçiminiz: ");
        select = input.nextInt();

        if(select==1){
            System.out.println("Toplam: " +(sayi1+sayi2));
        }
        else if(select==2){
            System.out.println("Farkı: " +(sayi1-sayi2));
        }
        else if(select==3){
            System.out.println("Çarpımı: " +(sayi1*sayi2));
        }
        else if(select==4){
            System.out.println("Bölümü: " +(sayi1/sayi2));
        }

    }
}
