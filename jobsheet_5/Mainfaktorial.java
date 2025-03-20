package jobsheet_5;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Mainfaktorial {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);

        System.out.print("Masukan nilai :");
        int nilai = mlebu.nextInt();

        //buat objek 
        Faktorial objekfk = new Faktorial();
        System.out.println("Nilai Faktorial menggunakan Brute Force :"+objekfk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial menggunakan metode Divide Conquer :"+objekfk.faktorialDC(nilai));
    }
}
