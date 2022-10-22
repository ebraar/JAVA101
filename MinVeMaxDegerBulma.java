import java.util.Scanner;

public class MinVeMaxDegerBulma {
    public static void main(String[] args) {
        int sayac, sayi, min=1, max=1;

        Scanner input = new Scanner(System.in);

        System.out.print("kaç tane sayı girmek istiyorsun? ");
        sayac = input.nextInt();

        for(int i=1; i<=sayac; i++){
            System.out.print(i+ ". sayiyi giriniz: ");
            sayi = input.nextInt();

            if(i==1){
                max = sayi;
                min = sayi;
            }

            if(sayi>max){
                max = sayi;
            }

            if(sayi<min){
                min = sayi;
            }
        }

        System.out.println("en büyük sayı: "+max);
        System.out.print("en küçük sayi: "+min);
    }
}
