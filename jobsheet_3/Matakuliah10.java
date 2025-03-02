package jobsheet_3;

import java.util.Scanner;

import jobsheet_2.mahasiswa;

public class Matakuliah10 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahjam;

    MatakuliahDemo10 a = new MatakuliahDemo10();

    public Matakuliah10(){

    }
    public Matakuliah10(String kode,String nama,int sks,int jumlahjam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }
        void cetakinfo(Matakuliah10[] array){
        for(int loop=0;loop<array.length;loop++){
            System.out.println("Data mata kuliah ke-"+(loop+1));
            System.out.println("kode       :  "+array[loop].kode); 
            System.out.println("Nama       :  "+array[loop].nama);   
            System.out.println("SKS        :  "+array[loop].sks); 
            System.out.println("JUmlah jam :  "+array[loop].jumlahjam); 
        }
        
        } 
        
        void tambahdata(Matakuliah10[] jsdlak,Matakuliah10[] jlkdas){
            Scanner mlebu = new Scanner(System.in);
            String hehe;
            for(int i=0;i<jsdlak.length;i++){//array nya habis jadi nambah lagi 
                jlkdas[i] = new Matakuliah10();
                jlkdas[i].kode = jsdlak[i].kode;
                jlkdas[i].nama = jsdlak[i].nama;
                jlkdas[i].sks = jsdlak[i].sks;
                jlkdas[i].jumlahjam = jsdlak[i].jumlahjam;
                
            }
            
            System.out.println("Masukan data mahasiswa ke-4");
            jlkdas[3] = new Matakuliah10();
            System.out.print("Kode :  ");
            jlkdas[3].kode = mlebu.nextLine();
            System.out.print("Nama :  ");
                jlkdas[3].nama = mlebu.nextLine();
                System.out.print("SKS :  ");
                hehe = mlebu.nextLine();
                jlkdas[3].sks = Integer.parseInt(hehe);
                System.out.print("JUmlah Jam :  ");
                hehe = mlebu.nextLine();
                jlkdas[3].jumlahjam = Integer.parseInt(hehe);

                System.out.println("Data mata kuliah ke-4");
            System.out.println("kode       :  "+jlkdas[3].kode); 
            System.out.println("Nama       :  "+jlkdas[3].nama);   
            System.out.println("SKS        :  "+jlkdas[3].sks); 
            System.out.println("JUmlah jam :  "+jlkdas[3].jumlahjam); 
                

        }
    
           
    }
    

