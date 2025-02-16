//ini yang royalgarden
public class Pertanyaan4 {
    
    public static void main(String[] args) {//ini fungsi main
        int[][] royalgarden = new int[4][4];
        //input data penjualan
        //data penjualan royalgarden1
        royalgarden[0][0]=10; royalgarden[0][1]=5;royalgarden[0][2]=15;royalgarden[0][3]=7;
        //data penjualan royalgarden2
        royalgarden[1][0]=6; royalgarden[1][1]=11;royalgarden[1][2]=9;royalgarden[1][3]=12;
        //data penjualan royalgarden3
        royalgarden[2][0]=2; royalgarden[2][1]=10;royalgarden[2][2]=10;royalgarden[2][3]=5;
        //data penjualan royalgarden4
        royalgarden[3][0]=5; royalgarden[3][1]=6;royalgarden[3][2]=12;royalgarden[3][3]=9;

        //memanggil fungsi untuk menghitung harga   
        fungsimenghitungtotalharga(royalgarden);
        fungsimenghitungtotalhargaroyalgarden4yangtanamannyaadayangmati(royalgarden);
    /* 
        for(int i=0;i<royalgarden.length;i++){
            for(int j=0;j<royalgarden[0].length;j++){
                System.out.println(royalgarden[i][j]);
            }
            
        }
        */

    }
    //fungsi ke dua :)))
    public static void fungsimenghitungtotalharga(int[][] royalgarden){
        String[] namatoko={"Royalgarden1","Royalgarden2","Royalgarden3","Royalgarden4"} ;
        int hargaaglonema = 75000,hargakeladi = 50000,hargaAlocasia=60000,hargaMawar=10000;

        System.out.println("Total seluruh  penjualan jika semua bunga habis terjual");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %n","Nama toko","Aglonema","Keladi","Alocasia","Mawar");
        for(int i =0;i<=namatoko.length-1;i++){
            System.out.printf("%-15s %-10d %-10d %-10d %-10d %n",namatoko[i],royalgarden[i][0],royalgarden[i][0],royalgarden[i][1],royalgarden[i][2],royalgarden[i][3]);
        }
        System.out.println("Diketahui Harga :");
        System.out.println("Aglonema Rp 75000");
        System.out.println("Keladi   Rp 50000");
        System.out.println("Alocasia Rp 60000");
        System.out.println("Mawar    Rp 10000");

        System.out.println("Maka perolehan dari setiap cabang adalah :");
        System.out.printf("%-15s %-15s %n","Nama toko","Total Pendapatan");
        for(int i=0;i<4;i++){
            System.out.printf("%-15s %-15d %n",namatoko[i],(royalgarden[i][0]*hargaaglonema)+(royalgarden[i][1]*hargakeladi)+(royalgarden[i][2]*hargaAlocasia)+(royalgarden[i][3]*hargaMawar));
        }
        
    } 
    //fungsi ke 3
    public static void fungsimenghitungtotalhargaroyalgarden4yangtanamannyaadayangmati(int[][] adatanamanyangmati){
        
    }   
    
}
