package jobsheet_3;

import java.util.Scanner;

import jobsheet_2.mahasiswa;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        String a;
        Scanner mlebu = new Scanner(System.in);
        Mahasiswa10[] arrayOfMahaasiswa = new Mahasiswa10[3];
        Mahasiswa10 arraymasuk = new Mahasiswa10();
    
        for(int i=0;i<arrayOfMahaasiswa.length;i++){
            
            arrayOfMahaasiswa[i] = new Mahasiswa10();
            System.out.println("Masukan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM   : ");
            arrayOfMahaasiswa[i].nim = mlebu.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahaasiswa[i].nama = mlebu.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahaasiswa[i].kelas = mlebu.nextLine();
            System.out.print("IPK : ");
            a = mlebu.nextLine();//a buat nanti di parsefloat atau konversi string ke float
            arrayOfMahaasiswa[i].ipk = Float.parseFloat(a);//harus pakai ini tidak bisa nextFloat.Kalau pake nextfloat input koma harus pakai "," bukan "."
            System.out.println("---------------------------------------------");
        }
        
        for(int i=0;i<arrayOfMahaasiswa.length;i++){
            System.out.printf("%-6s %-25s \n","NIM : ",arrayOfMahaasiswa[i].nim);
            System.out.printf("%-6s %-25s \n","Nama: ",arrayOfMahaasiswa[i].nama);
            System.out.printf("%-6s %-25s \n","kelas: ",arrayOfMahaasiswa[i].kelas);
            System.out.printf("%-6s %-25s \n","IPK : ",arrayOfMahaasiswa[i].ipk);
            System.out.println("---------------------------------------------------------------");
            
        }  
      /*
        arrayOfMahaasiswa[0] = new Mahasiswa10();
        arrayOfMahaasiswa[0].nim = "727777777777777777";
        arrayOfMahaasiswa[0].nama = "Zidane Sabilillah Ardiansjah";
        arrayOfMahaasiswa[0].kelas = "TI 1B";
        arrayOfMahaasiswa[0].ipk = 2.5f;

        arrayOfMahaasiswa[1] = new Mahasiswa10();
        arrayOfMahaasiswa[1].nim = "24410727";
        arrayOfMahaasiswa[1].nama = "Alif Ahnaf Hendrawan";
        arrayOfMahaasiswa[1].kelas = "TI 1I";
        arrayOfMahaasiswa[1].ipk = 3.56f;

        arrayOfMahaasiswa[2] = new Mahasiswa10();
        arrayOfMahaasiswa[2].nim = "24410203045";
        arrayOfMahaasiswa[2].nama = "Gura Hendrawan";
        arrayOfMahaasiswa[2].kelas = "TI 1Z";
        arrayOfMahaasiswa[2].ipk = 3.9f;
        

       
           */
    }
}
