import java.util.Scanner;

public class KdvOraniHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Güncel Tutarı Giriniz: ");
        tutar = input.nextInt();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = kdvTutar + tutar;
        System.out.print("KDV Eklenmiş Tutar: ");
        System.out.print(kdvliTutar);
    }
}