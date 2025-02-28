import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class program_hitung_volum_lp_kubus {
    public static void main(String[] args) {
        Scanner mlebu =  new Scanner(System.in);
        int pangjangrusuk=0,pilihan=0;
        //minta masukan dari user untuk panjang rusuk dulu ya
        pangjangrusuk = mintapanjangrusuk(pangjangrusuk);
        
        

        do{
            //print menu utk awalan
            printmenu();
            //minta inputan dari user
            pilihan = mlebu.nextInt();
            if(pilihan >=1 && pilihan <= 5){
               if(pilihan ==1){
                int Lp = hitunglp(pangjangrusuk);
                System.out.println("Luas Permukaan adalah "+Lp);
               }
               else if(pilihan ==2 ){
                int volume = hitungvolume(pilihan);
                System.out.println("Volume dari kubus tersebut adalah "+volume);
               }
               else if(pilihan == 3){
                int keliling = hitungkeliling(pangjangrusuk);
                System.out.println("keliling dari rusuk tersebut adalah "+keliling);
               }
               else if(pilihan == 4){
                main(args);
               }
               else if(pilihan == 5){
                mlebu.close();
                System.exit(0);
               }
            else{
                System.out.println("Angka tidak valid");
            }
        }
    }while(true);
        
    }
    public static int mintapanjangrusuk(int a){
        Scanner mlebu = new Scanner(System.in);
        int b = 0;
        System.out.print("Masukan panjang rusuk : ");
        b = mlebu.nextInt();
        return b ;


    }

    public static void printmenu(){
        System.out.println("Pilih Operasi ");
        System.out.println("1.Hitung LP\n2.Hitung Volume\n3.Hitung keliling\n4.Reset\n5.Keluar");
        System.out.print("Masukan angka : ");
    }

    public static int hitunglp(int a){
        int lp = 6*(a*a);
        return lp;

    }
    public static int hitungkeliling(int a){
        int b = a*12;
        return b;

    }
    public static int hitungvolume(int a){
        int b = a*a*a;
        return b;
    }
}