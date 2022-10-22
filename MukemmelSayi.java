import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int i, sayi, sayac=0;

        Scanner input = new Scanner(System.in);

        System.out.print("bir sayı giriniz: ");
        sayi = input.nextInt();

        for(i=1; i<=sayi; i++){
            if(sayi%i==0){
                sayac = sayac + i;
            }
        }
        sayac = sayac - sayi;

        if(sayac == sayi){
            System.out.println(sayi+ " mükemmel sayıdır.");
        } else{
            System.out.print(sayi+ " mükemmel sayı değildir.");
        }
    }
}
