import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int k, n1=0, n2=1, n3=3;

        Scanner input = new Scanner(System.in);
        System.out.print("eleman sayısını giriniz: ");
        k = input.nextInt();

        for(int i=1; i<=k; i++){
            n3=n1+n2;
            System.out.print(n1+ " + " +n2 + " = "+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }
    }
}
