import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;
        double total, perArmut=2.14, perElma=3.67, perDomates=1.11, perMuz=0.95, perPatlican=5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut? :");
        armut = input.nextInt();

        System.out.print("Kaç Kilo Elma? :");
        elma = input.nextInt();

        System.out.print("Kaç Kilo Domates? :");
        domates = input.nextInt();

        System.out.print("Kaç Kilo Muz? :");
        muz = input.nextInt();

        System.out.print("Kaç Kilo Patlıcan? :");
        patlican = input.nextInt();

        total = (armut * perArmut);
        total += (elma * perElma);
        total += (domates * perDomates);
        total += (muz * perMuz);
        total += (patlican * perPatlican);

        System.out.print("Toplam Tutar: " +total);

    }
}
