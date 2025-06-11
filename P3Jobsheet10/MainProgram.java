package P3Jobsheet10;

import java.lang.invoke.MethodHandleInfo;
import java.util.Scanner;

public class MainProgram {
    static void printMenu(){
        System.out.println("\n=== Menu antrian layanan akademik KRS === ");
        System.out.println("1. Tambah Mahasiswa ke antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Lihat mahasiswa terdepan");
        System.out.println("4. Lihat semua antrian");
        System.out.println("5. Jumlah mahasiswa dalam antrian");
        System.out.println("6. Cek antrian paling belakang");
        System.out.println("7. Reset");
        System.out.println("0. keluar");
        System.out.print("> Pilih menu : ");
    }
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        boolean perulangan = true;
        System.out.print("Masukan panjang queue : ");
        int panjangqueue = mlebu.nextInt();
        mlebu.nextLine();
        KodinganAtrean queue = new KodinganAtrean(panjangqueue);
        do {
            printMenu();
            int pilihan = mlebu.nextInt();
            mlebu.nextLine();

            switch (pilihan){
                case 1:
                    System.out.println("Masukan nama : ");
                    String nama = mlebu.nextLine();
                    System.out.println("Masukan kelas : ");
                    String kelas = mlebu.nextLine();
                    System.out.println("Masukan nim : ");
                    String nim = mlebu.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim,nama,kelas);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    perulangan = false;
                    mlebu.close();
                    System.out.println("Bye");
                    break;
                case 0:
                    break;
                default:

            }
        }while (perulangan);

    }
}
