import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        int size, temp=0;
        Scanner input = new Scanner(System.in);
        System.out.print("sıralamak istediğiniz dizinin boyutunu giriniz: ");
        size = input.nextInt();


        if(size>0){
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                System.out.print(i +". elemanı giriniz: ");
                arr[i] = input.nextInt();
            }
            System.out.println("sıralanmamış dizi:"+Arrays.toString(arr));

            for(int i=0; i<size; i++){
                for(int j=0; j<size; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] =arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("sıralanmış dizi: "+Arrays.toString(arr));
        }
        else{
            System.out.print("hatalı giriş!");
            System.exit(0);
        }
    }
}
