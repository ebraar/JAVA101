import java.util.Scanner;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[] args) {
        int km, yas, tip;
        double yasIndirimOrani;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("1)Tek Yön\n2)Gidiş-Dönüş\nYolculuk tipinizi seçiniz: ");
        tip = input.nextInt();

        if((km>0) && (yas>0) && (tip==1 || tip==2)){
            if(yas<12){
                yasIndirimOrani = 0.50;
            } else if(yas>12 && yas<24){
                yasIndirimOrani = 0.10;
            } else if(yas>65){
                yasIndirimOrani = 0.30;
            } else{
                yasIndirimOrani = 0;
            }

            double normalTutar = km*(0.10);
            double yasIndirimi = normalTutar * yasIndirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;
            double toplamTutar;

            if(tip==2){
                double gidisDonusIndirimi = indirimliTutar * (0.20);
                toplamTutar = (indirimliTutar - gidisDonusIndirimi)*2;
            } else{
                toplamTutar = indirimliTutar;
            }
            System.out.println("Toplam Tutar: "+toplamTutar+"Tl");
        } else{
            System.out.println("Hatalı Veri Girdiniz..!");
        }

    }
}
