package jobsheet_3;

import java.util.Scanner;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
    Scanner mlebu = new Scanner(System.in);
    Matakuliah10[] array = new Matakuliah10[3];
    String kode,nama,hehe;
    int sks,jumlahjam;

    for(int i=0;i<array.length;i++){
        System.out.println("Masukan data mata kuliah ke-"+(i+1));
        System.out.print("Kode :  ");
        kode = mlebu.nextLine();
        System.out.print("Nama : ");
        nama = mlebu.nextLine();
        System.out.print("SKS : ");
        hehe = mlebu.nextLine();
        sks = Integer.parseInt(hehe);
        System.out.print("Jumlah Jam : ");
        hehe = mlebu.nextLine();
        jumlahjam = Integer.parseInt(hehe);
        System.out.println("----------------------------------------------");

        array[i] = new Matakuliah10(kode, nama, sks, jumlahjam);
        
        Matakuliah10 masuk = new Matakuliah10();
        masuk.cetakinfo(array,i);

    }

    Matakuliah10 masuk = new Matakuliah10();

    /* 
    for(int i=0;i<array.length;i++){
     System.out.println("Data mata kuliah ke-"+(i+1));
     System.out.println("kode       :  "+array[i].kode); 
     System.out.println("Nama       :  "+array[i].nama);   
     System.out.println("SKS        :  "+array[i].sks); 
     System.out.println("JUmlah jam :  "+array[i].jumlahjam); 

    }*/
    }
    
}
