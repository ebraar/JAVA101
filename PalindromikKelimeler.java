import java.util.Scanner;

public class PalindromikKelimeler {
    static boolean isPalindrom(String str){
        for(int i=0, j=str.length()-1; i<j; i++, j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = "";

        while(!word.equals("0")){
            System.out.print("bir kelime yazın: ");
            word = input.next();

            if(isPalindrom(word) && !word.equals("0")){
                System.out.println("* "+word+" palindrom bir kelimedir.");
            } else if(!isPalindrom(word) && !word.equals("0")){
                System.out.println("* "+word+" palindrom bir kelime değildir.");
            }
            System.out.println();
        }
        System.out.println("program sonlandırıldı!");
    }
}
