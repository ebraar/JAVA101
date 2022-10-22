import java.util.Scanner;

public class RecursivePalindromSayilar {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;

        while(temp!=0){
            lastNumber = temp % 10; // son basamağı buldum.
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp = temp / 10;
        }

        if(number == reverseNumber){
            System.out.println("palindrom sayıdır.");
            return true;
        } else{
            System.out.println("palindrom sayı değildir.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı girin: ");
        int n = input.nextInt();
        System.out.println(isPalindrom(n));
    }
}
