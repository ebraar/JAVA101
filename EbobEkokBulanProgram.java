import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {
        int n1, n2;
        boolean a = false;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("n1 sayısını giriniz: ");
            n1 = input.nextInt();
            System.out.print("n2 sayısını giriniz: ");
            n2 = input.nextInt();

            if(n1 <=0 || n2<=0){
                System.out.print("pozitif sayılar giriniz!!");
            } else{
                a = true;
            }
        }while(!a);

        // alttaki if bloğunun amacı ebob ve ekok hesaplanırken
        // önce küçük sayının yazılmasından dolayıdır.
        // ilk başa küçük sayı yazılmasını sağlıyoruz.

        if(n2<n1){
            int tempN2 = n2;
            n2 = n1;
            n1 = tempN2;
        }

        int i = n1;
        while(i>=1){
            /* en büyük ortak bölen nasıl bulunur?
            mesela 5 ve 20: bunların en büyük bölenleri
            ikisini de 0'a bölmelidir. bize verilen en küçük
            sayıdan başlayarak ve 1 azaltılarak tüm değerler
            taranır.
             */
            if((n1%i==0) && (n2%i==0)){
                System.out.println("ebob: "+i);
                break;
            } else{
                i--;
            }
        }

        int j = n2;
        while(j<= (n1*n2)){
            /* en küçük ortak kat nasıl bulunur?
            burada da amaç aslında ikisininde sıfır olması.
            mesela 5 ve 20: bunların en büyük ortak katı 20'dir.
            bize verilen en büyük değer iki sayının çarpımına
            eşit olana kadar tüm değerler taranır.
             */
            if((j%n1==0) && (j%n2==0)){
                System.out.print("ekok: "+j);
                break;
            } else{
                j++;
            }
        }
    }
}
