import java.util.Scanner;

public class Pertanyaan3 {
    public static void main(String[] args) {
        //scanner
        Scanner mlebu = new Scanner(System.in);
        //int nilai
        int[] arraynilai = new int[8];
        int[] arraynilai_ipk = new int[8];
        String[] namamatkul = {"Pancasila","KTI","CTPS","Matematika ilmu yang menyenangkan","Bahasa Inggris","Daspro","Praktikum Daspro","K3"};//kita jadikan array saja biar tidak ngeprint ngeprint terus
        //memasukan nilai untuk setiap mata kuliah
        System.out.println("====================================");
        System.out.println("program untuk menghitung ip semester");
        System.out.println("====================================");
    
        
        for(int i=0;i<=7;i++){//for int utk ngulnagi sebanyak 7 kali matkul(cek array nama matkul)
            do{//do while utk cek apakah nilai yang dimasukan dibawah 100 atau diatas 0.
            System.out.print("Masukan nilai utk MK "+namamatkul[i]+" : ");
            arraynilai[i]=mlebu.nextInt();
            if (arraynilai[i]>100 || arraynilai[i]<0) {
                System.out.println("Nilai Invalid");
            }
            else{
                break;
            }
            }while(true);
        }

        
        //bagian cetak semua nilai
        System.out.println("====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================================");


        //menurut saya kurang efisien yg di bawah
        /* 
        arraynilai[1]= mlebu.nextInt();
        System.out.print("Masukan nilai utk MK CTPS : ");
        arraynilai[2] = mlebu.nextInt();
        System.out.print("Masukan nilai utk MK Matematika ilmu yang menyenangkan : ");
        arraynilai[3] = mlebu.nextInt();
        System.out.print("Masukan nilai utk MK Bahasa Inggris : ");
        arraynilai[4] = mlebu.nextInt();
        System.out.print("Masukan nilai utk MK Daspro : ");
        arraynilai[5] = mlebu.nextInt();
        System.out.print("Masukan nilai utk MK Praktikum Daspro : ");
        arraynilai[6] = mlebu.nextInt();
        System.out.print("Masukan nilai utk MK Praktikum Daspro : ");
        arraynilai[7] = mlebu.nextInt();
        */
    }
}
