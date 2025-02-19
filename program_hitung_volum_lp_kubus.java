
import java.util.concurrent.TimeUnit;
import java.util.Scanner;


public class program_hitung_volum_lp_kubus {
    public static void main(String[] args) {

        System.out.println("Program menghitung Luas,volume, dan keliling kubus.");
        System.out.println("Pencet ctrl+c untuk keluar");
        fungsimengeprintmenuawal();//scrol ke baris 12
        
    }


    public static void fungsimengeprintmenuawal(){//
        Scanner mlebu = new Scanner(System.in);
        int pilihan;
        int panjangrusuk=0,transfer=0;
        System.out.println("Pilih nomor 1-4");
        System.out.println("1. Hitung Luas Permukaan kubus");
        System.out.println("2. Hitung Volume kubus");
        System.out.println("3. Hitung Keliling kubus");
        System.out.println("4. ganti panjang rusuk");
        System.out.println("5. reset");
       
        System.out.print("Masukan pilihan anda (1-4) : ");
        pilihan = mlebu.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println(1);
                break;
            case 2:
            System.out.println(2);
                break;
            case 3 :

            case 4 :
                panjangrusuk = gantipanjangrusuk(transfer);
            default:
            System.out.println("Angka yang anda masukan tidak valdi");
            System.out.println("ulangi lagi");
            main(null);//kembali ke fungsi main
                break;
        }
    }

    public static gantipanjangrusuk(int panjangrusuk){

        {
            
        }
    }


}