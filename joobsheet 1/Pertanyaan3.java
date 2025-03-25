import java.util.Scanner;

public class Pertanyaan3 {
    public static void main(String[] args) {
        //scanner
        Scanner mlebu = new Scanner(System.in);
        //int nilai
        double rata2ipk=0;
        int[] arraynilai = new int[8];
        int[] arraynilai_ipk = new int[8];
        String[] arraynilai_ipk_huruf = new String[8];
        String[] namamatkul = {"Pancasila","KTI","CTPS","Matematika ilmu yang menyenangkan","Bahasa Inggris","Daspro","Praktikum Daspro","K3"};//kita jadikan array saja biar tidak ngeprint ngeprint terus
        //memasukan nilai untuk setiap mata kuliah
        System.out.println("====================================");
        System.out.println("program untuk menghitung ip semester");
        System.out.println("====================================");
    
        
        for(int i=0;i<=7;i++){//for int utk ngulnagi sebanyak 7 kali matkul(cek array nama matkul)

            do{//do while utk cek apakah nilai yang dimasukan dibawah 100 atau diatas 0.
            System.out.print("Masukan nilai utk MK "+namamatkul[i]+" : ");
            arraynilai[i]=mlebu.nextInt();
            if (arraynilai[i]>100 || arraynilai[i]<0) {//if else ini utk cek apakah nilai e nggenah atau tidak
                System.out.println("Bro lulusan dari universitas walmart");
            }
            else{//pemberian huruf pada nilai
                if (arraynilai[i]<=100 && arraynilai[i]>80){
                    arraynilai_ipk[i]+= 4;
                    arraynilai_ipk_huruf[i]= "A";
                }
                else if(arraynilai[i]<=80 && arraynilai[i]>73){
                    arraynilai_ipk[i]+= 3.5;
                    arraynilai_ipk_huruf[i]= "B+";
                }
                else if(arraynilai[i]<=73 && arraynilai[i]>65){
                    arraynilai_ipk[i]+= 3;
                    arraynilai_ipk_huruf[i]= "B"; 
                }
                else if(arraynilai[i]<=65 && arraynilai[i]>60){
                    arraynilai_ipk[i]+= 2.5;
                    arraynilai_ipk_huruf[i]= "C+";
                }
                else if(arraynilai[i]<=60 && arraynilai[i]>50){
                    arraynilai_ipk[i]+= 2;
                    arraynilai_ipk_huruf[i]= "C";
                }
                else if(arraynilai[i]<=50 && arraynilai[i]>39){
                    arraynilai_ipk[i]+= 1;
                    arraynilai_ipk_huruf[i]= "D";
                }
                else if(arraynilai[i]<=39){
                    arraynilai_ipk[i]+= 0;
                    arraynilai_ipk_huruf[i]= "E";
                }
                break;
            }
            }while(true);
        }

        
        //bagian cetak semua nilai
        System.out.println("====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================================");
        System.out.printf("%-40s %-20s %-20s %-20s %n","MK","Nilai Angka","Nilai Huruf","bobot nilai");//minus di %-40s utk menggeser text ke sebelah kiri.sedangkan 40 itu untuk ngasih jarak ke text ke kanan.s itu untuk mencetak string
        for(int i=0;i<=7;i++){//cetak nilai yang di input
            System.out.printf("%-40s %-20d %-20s %-20s %n",namamatkul[i],arraynilai[i],arraynilai_ipk_huruf[i],arraynilai_ipk[i]);
        }
        for(int i=0;i<=7;i++){
             rata2ipk += arraynilai_ipk[i];
        }
        System.out.println("Rata-rata IPK adalah : "+rata2ipk/8);
        mlebu.close();
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
