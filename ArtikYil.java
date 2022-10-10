import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();

        if(year%100==0 && year%400==0 && year%4==0){
            System.out.println("artık yıldır!");
        } else if(year%4==0 && year%100!=0){
            System.out.println("bir artık yıldır!");
        } else{
            System.out.println("bir artık yıl değildir!");
        }
    }
}
