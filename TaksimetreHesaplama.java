import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Km Değerini Giriniz: ");
        km = input.nextInt();

        total = (km * perKm);
        total = total + startPrice;

        System.out.print("Toplam Tutar : " +total);

    }
}
