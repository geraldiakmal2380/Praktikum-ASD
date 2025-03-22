package jobsheet_5;

import java.util.Scanner;

public class Mainsum {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        System.out.print("Masukan jumlah element : ");
        int element = mlebu.nextInt();

        sum objeksum = new sum(element);
        for(int i=0;i<element;i++){
            System.out.print("masukan angka ke-"+(i+1)+" : ");
            objeksum.keuntungan[i] = mlebu.nextInt();
        }

        System.out.println("total Keuntungan menggunakan Bruteforce"+objeksum.totalBF());
        System.out.println("total Keuntungan menggunakan Bruteforce"+objeksum.totalDC(objeksum.keuntungan,0,element-1));
    }
}
