package jobsheet_5;

public class nilaiutsmain {

    static int carinilaitertinggi(int[] array,int awalan,int akhiran){
        //Best case ketika array hanya ada 1 elemen atau rekursif telah mencapai akhir
        if(awalan == akhiran){
            return array[awalan];
        }

        //mencari index tengah
        int tengah = (awalan+akhiran)/2;
        //menggunakan fungsi rekursif untuk mencari valuenya
        int kiri = carinilaitertinggi(array, awalan, tengah);
        int kanan = carinilaitertinggi(array, tengah+1, akhiran);

        return Math.max(kiri,kanan);//Math.max digunakan untuk mereturn angka tertinggi dalam perbandingan
    }

    static int carinilaiterendah(int[] iniarrayya,int awal,int akhir){
        if(awal==akhir){
            return iniarrayya[awal];
        }
        //cari posisi tengah array
        int tengah = (awal+akhir)/2;

        int kiri = carinilaiterendah(iniarrayya, awal, tengah);
        int kanan = carinilaiterendah(iniarrayya, tengah+1, akhir);

        return Math.min(kiri, kanan);

    }
    public static void main(String[] args) {

        nilaiuts[] erere = new nilaiuts[8];
        erere[0] = new nilaiuts("220101001", 2022, 78, 82);
        erere[1] = new nilaiuts("220101002", 2022, 85, 88);
        erere[2] = new nilaiuts("220101002", 2022, 90, 87);
        erere[3] = new nilaiuts("220101002", 2022, 76, 79);
        erere[4] = new nilaiuts("220101002", 2022, 93, 95);
        erere[5] = new nilaiuts("220101002", 2022, 88, 85);
        erere[6] = new nilaiuts("220101002", 2022, 80, 83);
        erere[7] = new nilaiuts("220101002", 2022, 82, 84);
        
        //mendaftarkan nilai uts data pd array
        int[] iniarray = new int[erere.length];
        for(int i=0;i<iniarray.length;i++){
            iniarray[i] = erere[i].nilaiuts;
        }
        //mulai metode divide and conquer
        int nilaitertinggi = carinilaitertinggi(iniarray,0,iniarray.length-1);//cek baris 5
        System.out.println("Nilai Tertinggi adalah "+nilaitertinggi);
        int nilaiterendah  = carinilaiterendah(iniarray,0,iniarray.length-1);
        System.out.println("Nilai terendah adalah  "+nilaiterendah);

    }
    

    


    
    
}
