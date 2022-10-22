import java.util.Scanner;

public class GelismisHesapMakinesi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.print(i++ + ".sayı: ");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }
            result = result + number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("kaç adet sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı: ");
            number = scan.nextInt();

            if (i == 1) {
                result = result + number;
                continue;
            }
            result = result - number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ".sayı: ");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result = result * number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("kaç adet sayı gireceksiniz?: ");
        int counter = scan.nextInt();

        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayı: ");
            number = scan.nextDouble();

            if (i != 1 && number == 0) {
                System.out.print("böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result = result / number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("üs değeri giriniz: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Sonuç: " + result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-toplama işlemi\n"
                + "2-çıkarma işlemi\n"
                + "3-çarpma işlemi\n"
                + "4-bölme işlemi\n"
                + "5-üs alma\n"
                + "6-faktöriyel\n"
                + "7-ÇIKIŞ";
        do {
            System.out.println(menu);
            System.out.print("bir işlem seç: ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("yanlış seçim");
            }
        } while (select != 0);
    }
}


