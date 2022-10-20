import java.util.Scanner;

public class AtmUygulamasi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        int right =3, balance=1500, select;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Parolanız: ");
        password = input.nextLine();

        if(userName.equals("ebolak") && password.equals("1287")) {
            System.out.print("Ebolak bankasına hoşgeldiniz.\nYapmak istediğiniz işlem seçiniz\n");
            System.out.println("Para yatırma için 1, " +
                    "\nPara çekmek için 2,\nBakiye sorgulama için 3,\nÇıkış için 4 basınız.");

            select =input.nextInt();

            switch (select){
                case 1:
                    System.out.println("Para miktarı: ");
                    int b=input.nextInt();
                    balance+=b;
                    System.out.print("Bakiyeniz "+balance);
                    break;
                case 2:
                    System.out.println("Çekme istediğiniz tutar: ");
                    int h=input.nextInt();
                    if(h>balance){
                        System.out.println("Yetersiz bakiye");
                        break;}
                    else {
                        balance -= h;
                        System.out.println("Bakiyeniz: " + balance);
                    }break;

                case 3:
                    System.out.println("Mevcut Bakiyeniz: "+balance);
                    break;
                case 4:
                    System.out.println("İyi günler. Yine bekleriz...");
                    break;
            }

        }
        else {
            right--;
            System.out.println("Hatalı kullanıcı veya şifre girdiniz tekrar deneyiniz.");
            if(right==0)
                System.out.println("Hesabınız bloke oldu. Bankayla iletişime geçiniz.");
        }


    }
}
