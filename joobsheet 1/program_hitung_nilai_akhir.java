import java.util.Scanner;

public class program_hitung_nilai_akhir {

    public static void main(String[] args) {
        int nilaitugas,nilaikuis,nilaiuts,nilaiuas;    
        double nilaiakhir=0;
        Scanner mlebu = new Scanner(System.in);
        //loop utk minta data pengguna
        //loop ini berfungsi sebagai ketika ada data yang anomali biar bisa diulangi lagi 
        do{
        System.out.println("Program menghitung nilai akhir");
        System.out.println("==============================");
        System.out.print("masukan nilai tugas : ");
        nilaitugas = mlebu.nextInt();
        System.out.print("masukan nilai kuis : ");
        nilaikuis = mlebu.nextInt();
        System.out.print("Masukan nilai UTS : ");
        nilaiuts = mlebu.nextInt();
        System.out.print("Masukan nilai UAS : ");
        nilaiuas = mlebu.nextInt();
        //cek apakah ada nilai yang lebih dari 100 atau kurang dari 0
        if (nilaitugas<0 || nilaitugas>100 || nilaikuis<0 || nilaikuis>100 || nilaiuas<0 || nilaiuas>100 || nilaiuts<0 || nilaiuts>100){
            System.out.println("sepertinya nilai yang anda masukan ada yang tidak valid");
            System.out.println("kita ulangi ya ges");
        }
        else{
            break;
        }
        }while(true);
        System.out.println("==============================");
        System.out.println("==============================");
        //area pengecekan kategori nilai
        nilaiakhir = (0.2*nilaitugas)+(0.2*nilaikuis)+(0.3*nilaiuts)+(0.3*nilaiuas);
        System.out.println("nilai akhir adalah "+nilaiakhir);
        if(nilaiakhir>80 && nilaiakhir<=100){
            System.out.println("Nilai Huruf : A");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiakhir>73 && nilaiakhir<=80){
            System.out.println("Nilai Huruf : B+");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiakhir>65 && nilaiakhir<=73){
            System.out.println("Nilai Huruf : B");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiakhir>60 && nilaiakhir<=65){
            System.out.println("Nilai Huruf : C+");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiakhir>50 && nilaiakhir<=60){
            System.out.println("Nilai Huruf : C");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Selamat anda lulus");
        }
        else if(nilaiakhir>39 && nilaiakhir<=50){
            System.out.println("Nilai Huruf : D");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Maaf anda tidak lulus");
        }
        else if(nilaiakhir<=39){
            System.out.println("Nilai Huruf : E");
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println("Maaf anda tidak lulus");
        }
        mlebu.close();
        
        
        
        

    }
}