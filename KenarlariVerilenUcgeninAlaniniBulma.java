import java.util.Scanner;

public class KenarlariVerilenUcgeninAlaniniBulma {

    public static void main(String[] args) {
        
        double kenar1, kenar2, kenar3;
        double u, alan;

        Scanner sayi = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        kenar1 = sayi.nextDouble();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        kenar2 = sayi.nextDouble();

        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        kenar3 = sayi.nextDouble();

        u = (kenar1 + kenar2 + kenar3) / 2;

        alan = Math.sqrt((u*((u-kenar1)*(u-kenar2)*(u-kenar3))));
        System.out.print("Üçgenin Alanı:"+alan);

    }
}
