import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        if(mat>0 && mat<=100){
            toplam = toplam + mat;
        } else{
            System.out.println("Geçersiz not girdiniz!!");
            System.exit(0);
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        if(fizik>0 && fizik<=100){
            toplam = toplam + fizik;
        } else{
            System.out.println("Geçersiz not girdiniz!!");
            System.exit(0);
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        if(turkce>0 && turkce<=100){
            toplam = toplam + turkce;
        } else{
            System.out.println("Geçersiz not girdiniz!!");
            System.exit(0);
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        if(kimya>0 && kimya<=100){
            toplam = toplam + kimya;
        } else{
            System.out.println("Geçersiz not girdiniz!!");
            System.exit(0);
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        if(muzik>0 && muzik<=100){
            toplam = toplam + muzik;
        } else{
            System.out.println("Geçersiz not girdiniz!!");
            System.exit(0);
        }

        double avarage = toplam / 5;
        if(avarage <= 55){
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Ortalamanız: "+avarage);
        } else{
            System.out.println("Tebrikler geçtiniz");
            System.out.println("Ortalamanız: "+avarage);
        }

    }
}
