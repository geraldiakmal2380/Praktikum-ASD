package jobsheet_9;

import java.util.Scanner;
import java.util.Stack;

public class SuratDemo10 {
    static void FungsiPrint(){
        System.out.println("1.Kumpulkan Surat");
        System.out.println("2.Proses surat");
        System.out.println("3.Melihat Surat teratas");
        System.out.println("4.List semua Surat");
        System.out.println("5.Cari Surat berdasar Nama Mahasiswa");
        System.out.println("6.keluar");
        System.out.print("Masukan pilihan : ");
    }
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        boolean perulangan = true;
        StackSurat10 stackKeSurat = new StackSurat10(5);//membuat stack
        Surat10 objectSurat2 = new Surat10();
        int idSurat=-1;

        do{
            FungsiPrint();
            int pilihan = mlebu.nextInt();
            mlebu.nextLine();

            switch (pilihan){
                case 1:
                    idSurat++;
                    System.out.println("Masukan Nama : ");
                    String Nama = mlebu.nextLine();
                    System.out.println("Masukan kelas : ");
                    String Kelas = mlebu.nextLine();
                    System.out.println("Jenis Izin ? (A/I/S): ");
                    char jenisizin = mlebu.nextLine().charAt(0);
                    System.out.println("Berapa lama ? (hari): ");
                    int durasi = mlebu.nextInt();
                    System.out.println("ID surat otomatis adalah "+idSurat);
                    String StringidSurat = String.valueOf(idSurat);
                    Surat10 objectSurat = new Surat10(StringidSurat,Nama,Kelas,jenisizin,durasi);
                    stackKeSurat.push(objectSurat);//mengirim object surat ke Stacksurat
                    break;
                case  2:
                    //tambahi if else sesuai nanti aja lah
                    break;
                case 3:
                    break;
                case 4:
                stackKeSurat.printsemua();
                    break;
                case  5:
                    break;
                case 6:
                    System.out.println("bye");
                    perulangan = false;
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        }while (perulangan);


    }
}
