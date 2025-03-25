package jobsheet_5;

import java.util.Scanner;

public class Mainpangkat {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        System.out.print("Masukan jumlah Elemen : ");
        int elemen = mlebu.nextInt();

        Pangkat[]  omagat = new Pangkat[elemen];
        Pangkat obj = new Pangkat();

        for(int i=0;i<elemen;i++){
            System.out.print("Masukang basis ke-"+(i+1)+": ");
            int basis = mlebu.nextInt();
            System.out.print("Masukang pangkat ke-"+(i+1)+": ");
            int pangkat = mlebu.nextInt();
            omagat[i] = new Pangkat(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE");
        for(Pangkat p:omagat){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        obj.printtanpaparameter();
        System.out.println("HASIL PANGKAT DIVIDE AND QONQUER");
        for(Pangkat p:omagat){
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
