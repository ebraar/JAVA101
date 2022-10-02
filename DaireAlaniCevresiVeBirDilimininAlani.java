import java.util.Scanner;

public class DaireAlaniCevresiVeBirDilimininAlani {
    public static void main(String[] args) {

        int yaricap, alfa;
        double alfaAlan, alan, cevre, pi =3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        yaricap = input.nextInt();

        cevre = (2*pi*yaricap);
        alan = pi * (yaricap * yaricap);

        System.out.print("alfa derece daire diliminin alanı için alfayı giriniz: ");
        alfa = input.nextInt();

        alfaAlan = ( pi * (yaricap * yaricap) * alfa) / 360;

        System.out.println("Dairenin Çevresi: " +cevre);
        System.out.println("Dairenin Alanı: " +alan);
        System.out.println("Alfa Derece Daire Diliminin Alani: " +alfaAlan);
    }
}
