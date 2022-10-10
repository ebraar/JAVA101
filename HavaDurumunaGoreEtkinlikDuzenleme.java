import java.util.Scanner;

public class HavaDurumunaGoreEtkinlikDuzenleme {
    public static void main(String[] args) {
         double sicaklik;

         Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak merkezine gitmeye ne dersin?");
        } else if(sicaklik>5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsin bence..");
        } else if(sicaklik>15 && sicaklik<=25){
            System.out.println("Pikniğe git bu havalar zor bulunur.");
        } else{
            System.out.println("Yüzmek için efsane bi hava.");
        }

    }
}
