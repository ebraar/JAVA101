import java.util.Scanner;

public class JavaDonguOrnegi {
    public static void main(String[] args) {
       int i, toplam=0;
       Scanner input = new Scanner(System.in);
       do{
           System.out.print("bir sayı gir: ");
           i = input.nextInt();

           if(i%2==0 && i%4==0){
               toplam = toplam + i;
           }
       }while(i%2==0);
        System.out.println("Girilen çift ve dördün katları olan sayıların toplamı: " +toplam);

    }
}
