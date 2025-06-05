package P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademiSiakad {
    public static void printMenuAwal(){
        System.out.println("\n=== Menu antrian layanan akademik === ");
        System.out.println("1. Tambah Mahasiswa ke antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat mahasiswa terdepan");
        System.out.println("4. Lihat semua antrian");
        System.out.println("5. Jumlah mahasiswa dalam antrian");
        System.out.println("0. keluar");
        System.out.print("Pilih menu : ");
    }
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;
        boolean perulangan = true;

        do{
            printMenuAwal();
            pilihan = mlebu.nextInt();
            mlebu.nextLine();
            switch (pilihan){
                case 1:
                    System.out.print("NIM : ");
                    String nim = mlebu.nextLine();
                    System.out.print("Nama : ");
                    String nama = mlebu.nextLine();
                    System.out.print("prodi : ");
                    String prodi = mlebu.nextLine();
                    System.out.print("kelas : ");
                    String kelas = mlebu.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim,nama,prodi,kelas);
                    antrian.tambahanAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if(dilayani != null){
                        System.out.println("Melayani mahasiswa : ");

                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah data dalam antrian adalah "+antrian.getJumlahAntrian());
                    break;
                case 0:
                    perulangan = false;
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
        }while (perulangan) ;


    }
}
