import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;
import javax.sound.midi.SysexMessage;

public class Programyangdapatmenerimainputmatakuliah {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);

        String[] namaMk ={"Pancasila","KTI","CTPS","Matematika ilmu yang menyenangkan","Bahasa Inggris","Daspro","Praktikum Daspro","K3"};
        int[] SKS ={2,3,4,2,4,2,1,4};    
        int[] semester ={1,1,1,1,1,1,1,1};
        String[] harikuliah = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu","Senin"};
        printjadwal(namaMk,harikuliah,semester,SKS);
        printjadwalhartitertenru(namaMk,harikuliah,semester,SKS);
        printjadwalsemestertertentu(namaMk,harikuliah,semester,SKS);
        mencarimatakuliah(namaMk,harikuliah,semester,SKS);
        }

        public static void printjadwal(String[] namaMK, String[] hari,int[] semester,int[] SKS){
            //format HARI,NAMA MK,SKS,SEMESTER
            System.out.printf("%-17s %-50s %-17s %-17s\n","HARI","NAMA MK","SKS","SEMESTER");
            for(int i=0;i<namaMK.length;i++){
                System.out.printf("%-17s %-50s %-17s %-17s\n",hari[i],namaMK[i],SKS[i],semester[i]);
            }
        }

        public static void printjadwalhartitertenru(String[] namaMK, String[] hari,int[] semester,int[] SKS){
            Scanner mlebu = new Scanner(System.in);
            String hariygdipilih;

            System.out.print("Masukan Hari yang dipilih :");
            hariygdipilih = mlebu.next();
            mlebu.nextLine();
            System.out.printf("%-17s %-50s %-17s %-17s\n","HARI","NAMA MK","SKS","SEMESTER");
            for(int i=0;i<hari.length;i++){
                if (hariygdipilih.equalsIgnoreCase(hari[i]) ) {
                    System.out.printf("%-17s %-50s %-17s %-17s\n",hari[i],namaMK[i],SKS[i],semester[i]);
                }
            }
            
        }

        public static void printjadwalsemestertertentu(String[] namaMK, String[] hari,int[] semester,int[] SKS){
            Scanner mlebu = new Scanner(System.in);
            int semesterygdipilih;

            System.out.print("Masukan Semester yg dipilih : ");
            semesterygdipilih = mlebu.nextInt();
            System.out.printf("%-17s %-50s %-17s %-17s\n","HARI","NAMA MK","SKS","SEMESTER");
            for(int i=0;i<semester.length;i++){
                if (semesterygdipilih == semester[i]) {
                    System.out.printf("%-17s %-50s %-17s %-17s\n",hari[i],namaMK[i],SKS[i],semester[i]);
                }
            
            }
        }
        public static void mencarimatakuliah(String[] namaMK, String[] hari,int[] semester,int[] SKS){
            Scanner mlebu = new Scanner(System.in);
            String pilihan;
            System.out.print("Masukan mata kuliah yang ingin anda cari : ");
            pilihan = mlebu.next();
            mlebu.nextLine();
            System.out.printf("%-17s %-50s %-17s %-17s\n","HARI","NAMA MK","SKS","SEMESTER");
            for(int i =0;i<namaMK.length;i++){
                if(pilihan.equalsIgnoreCase(namaMK[i])){
                    System.out.printf("%-17s %-50s %-17s %-17s\n",hari[i],namaMK[i],SKS[i],semester[i]);
                }
            }
            mlebu.close();
        }
    }

