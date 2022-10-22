import java.util.Scanner;

public class YildizlarlaTersUcgenYapma {
    public static void main(String[] args) {
        int sayi, i, j, k;

        Scanner input = new Scanner(System.in);

        System.out.print("basamak sayısı giriniz: ");
        sayi = input.nextInt();

        for(i=sayi; i>0; i--){
            // en baştaki büyük for basamakları kontrol eder.

            for(k=sayi-i; k>0; k--){
                System.out.print(" ");
            }
            //boşlukları yazdırıyor.

            for (j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }
            /* oradaki (2*i)-1 basamakların ardışık tek
            halinde gitmesini sağlıyor.
             */

            System.out.println(" ");
        }
    }
}
