package jobsheet_9;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args){
        Scanner mlebu = new Scanner(System.in);
        StackTugasMahasiswa10 stack = new StackTugasMahasiswa10(5);
        boolean perulangan =true;
        int pilihan;

        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Terbawah");
            System.out.println("4. Melihat Tugas Teratas");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Berapa banyak tugas yg dikumpulkan?");
            System.out.println("7. Keluar");
            System.out.print("Masukan Pilihan (1/2/3/4/5) : ");
            pilihan = mlebu.nextInt();
            mlebu.nextLine();

            switch (pilihan){
                case 1 :
                    System.out.print("Nama : ");
                    String nama = mlebu.nextLine();
                    System.out.print("NIM : ");
                    String NIM = mlebu.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = mlebu.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(NIM,nama,kelas);
                    stack.push(mhs);

                    break;
                case 2:
                    Mahasiswa10 dinilai = stack.pop();
                    if(dinilai != null){
                        System.out.println("Menilai tugas dari "+dinilai.nama);
                        System.out.print("Masukan nilai (1-100) : ");
                        int nilai = mlebu.nextInt();
                        dinilai.TugasDiNilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d \n",dinilai.nama,nilai);
                    }
                    break;
                case 3:
                    Mahasiswa10 LihatTerbawah = stack.peekterbawah();
                    System.out.println("Mahasiswa Rajin yang mengumpulkan tugas pertama adalah "+LihatTerbawah.nama);
                    break;
                case 4:
                    Mahasiswa10 lihat = stack.peek();
                    if(lihat !=null){
                        System.out.println("Tugas Terakhir kali dikumpulkan oleh "+lihat.nama);
                    }
                    else {
                        if(lihat == null){
                            System.out.println("hmmmmmmm");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.printf("%-15s %-15s %-15s","Nama","NIM","Kelas");
                    stack.print();
                    break;
                case 6:
                    int berapa = stack.BerpaBanyakTugasYangSudahDikumpulkan();
                    System.out.println("Banyak tugas yang sudah dikumpulin adalah "+berapa);
                    break;
                case 7 ://keluar dari program
                    System.out.println("bye");
                    perulangan = false;

                    break;
                default:
                    System.out.println("Input Invalid");
            }
        }while (perulangan);
    }
}

