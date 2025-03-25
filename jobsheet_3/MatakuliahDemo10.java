package jobsheet_3;

import java.util.Arrays;
import java.util.Scanner;

import jobsheet_2.mahasiswa;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
    Scanner mlebu = new Scanner(System.in);
    Matakuliah10[] array = new Matakuliah10[3];
    Matakuliah10[] arraykeluar = new Matakuliah10[4];
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
        
        

    }
    Matakuliah10 lkjasdljkad = new Matakuliah10();
    lkjasdljkad.cetakinfo(array);
    lkjasdljkad.tambahdata(array,arraykeluar);
    



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
