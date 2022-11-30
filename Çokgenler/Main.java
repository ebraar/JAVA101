import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kenarSayisi;
        String isim;

        Scanner input = new Scanner(System.in);

        System.out.print("kenar sayısını giriniz: ");
        kenarSayisi = input.nextInt();

        System.out.print("isim giriniz: ");
        isim = input.next();

        Cokgenler cokgen = new Cokgenler(kenarSayisi,isim);

        System.out.println(cokgen.icAciBul());
        System.out.println(cokgen.disAciBul());
    }
}
