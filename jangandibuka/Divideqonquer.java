public class Divideqonquer {

    public static int penjumlahan(int[] arraymasuk,int kiri,int kanan){// 0 4
        if(kiri==kanan){
            return arraymasuk[kiri];
        }

        int mid = (kanan+kiri)/2;
        //1. mid nya 2

        int bagiankiri = penjumlahan(arraymasuk,kiri,mid);// default,0,2
        System.out.println("bagiankiri "+bagiankiri);
        int bagiankanan = penjumlahan(arraymasuk,mid+1,kanan);//default,1,0
        System.out.println("bagian kanan "+bagiankanan);
        return bagiankiri+bagiankanan;

    }
    public static void main(String[] args) {
        int[] arrayku = {1,2,3,4,5};

        //mulai menjumlahkan
        int hasil = penjumlahan(arrayku,0,arrayku.length-1);
        System.out.println(hasil);
    }
}
