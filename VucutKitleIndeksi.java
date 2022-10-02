import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        int kg;
        double boy, indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
        kg = input.nextInt();

        indeks = kg / (boy * boy);

        System.out.print("Vücut Kitle İndeksiniz: " +indeks);
    }
}
