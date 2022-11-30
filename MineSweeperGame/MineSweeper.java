import com.sun.security.jgss.GSSUtil;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    String[][] mayinMap;
    String[][] gameMap;
    int mayinSayisi;
    int a;
    int b;
    int count;
    boolean isTrue = true;


    public MineSweeper(int row, int col) {
        this.rowNumber = row;
        this.colNumber = col;
        this.gameMap = new String[row][col];
        this.mayinMap = new String[row][col];
        this.mayinSayisi = (row * col) / 4;

    }
    public void mayinMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mayinMap[i][j] = "-";
                gameMap[i][j] = "-";

            }
        }
    }

    public void randomNumber() {
        Random r = new Random();
        for (int i = 0; i < this.mayinSayisi; i++) {
            int rsayi = r.nextInt(this.rowNumber);
            int rsayi2 = r.nextInt(this.colNumber);
            if (!this.mayinMap[rsayi][rsayi2].equals("*")) {
                this.mayinMap[rsayi][rsayi2] = "*";
            }
        }
    }

    public void printmayinMap() {
        System.out.println("Mayinlarin Konumu");
        randomNumber();
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (!this.mayinMap[i][j].equals("*")) {
                    this.mayinMap[i][j] = "-";
                }
                System.out.print(this.mayinMap[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==================================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeliniz !");
    }

    public void printGameMap() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.gameMap[i][j] = "-";
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void indisSecme() {
        Scanner inp = new Scanner(System.in);
        isTrue = false;
        while (!isTrue) {
            System.out.print("Satir Giriniz : ");
            a = inp.nextInt();
            System.out.print("Sutun Giriniz : ");
            b = inp.nextInt();
            if (a > rowNumber || b > colNumber) {
                System.out.println("Map sinirlari disinda secim yaptınız tekrar giriniz !");
                continue;
            }
            if (mayinMap[a][b].equals("*")) {
                System.out.println("Game Over!");
                break;

            }
            control();
            if (finish()) {

                System.out.println("Tebrikler kazandiniz :)))))");
                break;
            }
        }
    }

    public void control() {
        count = 0;
        for (int i = (a - 1); i <= (a + 1); i++) {
            for (int j = (b - 1); j <= (b + 1); j++) {
                if (i < 0 || j < 0 || i >= this.rowNumber || j >= this.colNumber) {
                    continue;
                }
                if (this.mayinMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        this.gameMap[a][b] = String.valueOf(count);
        this.mayinMap[a][b] = String.valueOf(count);
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean finish() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                if (this.mayinMap[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
    public void run() {
        mayinMap();
        printmayinMap();
        indisSecme();
    }
}