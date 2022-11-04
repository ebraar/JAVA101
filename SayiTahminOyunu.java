import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        // int number = (int) (Math.random()*100);

        Scanner input = new Scanner(System.in);

        int right=0, selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while(right<5){
            System.out.print("lütfen tahmininizi giriniz: ");
            selected = input.nextInt();

            if(selected<0 || selected>99){
                System.out.println("lütfen 0-100 arasında bir değer giriniz.");

                if(isWrong){
                    right++;
                    System.out.println("çok fazla hatalı giriş yaptınız.\nkalan hak: "+(5-right));
                } else{
                    isWrong = true;
                    System.out.println("bir daha hatalı girişinizde hakkınızdan düşürülecektir.");
                }
                continue;
            }
            if(selected == number){
                System.out.println("tebrikler, doğru tahmin! tahmin ettiğin sayı: "+number);
                isWin = true;
                break;
            }else{
                System.out.println("hatalı bir sayı girdiniz!");
                if (selected > number) {
                    System.out.println(selected+ " sayısı, gizli sayıdan büyüktür.");
                } else{
                    System.out.println(selected+ " sayısı, gizli sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("kalan hak: "+(5-right));
            }
        }
        if(!isWin){
            System.out.println("kaybettiniz!");
            if(!isWrong){
                System.out.println("tahminleriniz: "+Arrays.toString(wrong));
            }
        }
    }
}
