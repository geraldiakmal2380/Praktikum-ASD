package joobsheet_7;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        Scanner mlebu = new Scanner(System.in);
        int jumMhs=5;

        for(int i=0;i<jumMhs;i++){
            System.out.println("Masukan data Mahasiswa ke-"+(i+1));
            System.out.print("NIM   : ");
            String nim = mlebu.nextLine();
            System.out.print("Nama  : ");
            String nama = mlebu.nextLine();
            System.out.print("Kelas : ");
            String kelas = mlebu.nextLine();
            System.out.print("IPK   : ");
            String ip = mlebu.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------------------");
            list.tambah(new Mahasiswa10(nim,nama,kelas,ipk));
            
        }
        list.tampil();
        list.sequentialsearch(3);
    }
}
