import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, comb, totaln=1, totalr=1, totalnr=1;

        System.out.print("C(n,r) biçimindeki n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("C(n,) biçimindeki r değerini giriniz: ");
        r = input.nextInt();

        for(int i=1; i<=n; i++){
            totaln = totaln * i;
        }
        for(int j=1; j<=r; j++){
            totalr = totalr * j;
        }
        int nFarkR = n - r;

        for(int k=1; k<=nFarkR; k++){
            totalnr = totalnr * k;
        }

        comb = (totaln / (totalr * totalnr));

        System.out.println("C("+n+","+r+")=" +comb);
    }
}
