public class AsalSayiBulma{
    public static void main(String[] args){

        int sayac = 0;

        for (int i=2; i<=100; i++){
            // en büyük for tüm sayıları taramak için.
            for (int k=2; k<i; k++){
                /* burada mesela i=11 olsun.
                sırayla bakıyor 11 hangi sayılara
                bölünür diye. hiçbir sayıya bölünemediği
                için sayac==0 olarak kalıyor. ve 11'in
                asal sayı olduğunu anlıyoruz.
                 */
                if (i%k==0) {
                    sayac++;
                }
            }
            if (sayac==0){
                System.out.println(i);
            }
            sayac = 0;
        }
    }
}
