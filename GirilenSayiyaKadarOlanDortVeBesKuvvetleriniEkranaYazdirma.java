import java.util.Scanner;

public class GirilenSayiyaKadarOlanDortVeBesKuvvetleriniEkranaYazdirma {
    public static void main(String[] args) {

        int sayi, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();

        System.out.print( sayi+ " sayısından küçük dördün kuvvetleri: ");
        for(i=1; i<=sayi; i*=4){
            System.out.print(i+ "  ");
        }
        System.out.print("\n");
        
        System.out.print( sayi+ " sayısından küçük beşin kuvvetleri: ");
        for(i=1; i<=sayi; i*=5){
            System.out.print(i+"  ");
        }
    }
}
