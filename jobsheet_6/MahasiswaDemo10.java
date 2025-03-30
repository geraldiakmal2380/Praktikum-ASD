package jobsheet_6;

import java.util.Scanner;

public class MahasiswaDemo10 {

    static void mintadata(String[][] a,int[] d){//fungsi meminta data
        Scanner mlebu = new Scanner(System.in);

        System.out.println("Saya minta datam dulu ya");
        for(int i=0;i<a.length;i++){
            //int looopke = 0;
            System.out.print("Masukan Nama Mahasiswa : ");
            a[i][0] = mlebu.nextLine();
            System.out.print("Masukan Kelas Mahasiswa : ");
            a[i][1] = mlebu.nextLine();
            System.out.print("Masukan NIM Mahasiswa : ");
            a[i][2] = mlebu.nextLine();
            System.out.print("Masukan IPK Mahasiswa : ");
            d[i] = mlebu.nextInt();
            //sumpah aku gatau kenapa nanti dibawah ini ilang langsung nge skip
            String aa = mlebu.nextLine();

        }
        mlebu.close();
    }
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
            String[][] a= new String[5][3];
            int[] d = new int[5];
            System.out.println(a.length);
            mintadata(a,d);
            System.out.println("");
        
        

        Mahasiswa a1 = new Mahasiswa(a[0][0],a[0][1],a[0][2],d[0]);
        Mahasiswa m2 = new Mahasiswa(a[1][0],a[1][1],a[1][2],d[1]);
        Mahasiswa m3 = new Mahasiswa(a[2][0],a[2][1],a[2][2],d[2]);
        Mahasiswa m4 = new Mahasiswa(a[3][0],a[3][1],a[3][2],d[3]);
        Mahasiswa m5 = new Mahasiswa(a[4][0],a[4][1],a[4][2],d[4]);

        list.tambah(a1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5); 
        

        System.out.println("Data Mahasiswa sebelum sorting : ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

    }
    

    
}
