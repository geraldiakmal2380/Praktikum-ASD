//ini yang royalgarden
public class Pertanyaan4 {
    int hargaaglonema = 75000,hargakeladi = 50000,hargaAlocasia=60000,hargaMawar=10000;//tak taruh sini biar kebaca semua fungsi
    
    public static void main(String[] args) {
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
        fungsimenghitungtotalharga();

    /* 
        for(int i=0;i<royalgarden.length;i++){
            for(int j=0;j<royalgarden[0].length;j++){
                System.out.println(royalgarden[i][j]);
            }
            
        }
        */

    }
    public static void fungsimenghitungtotalharga(){
        System.out.println("Total seluruh  penjualan jika semua bunga habis terjual");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %n","Nama toko","Aglonema","Keladi","Alocasia","Mawar");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %n","RoyalGarden1","Aglonema","Keladi","Alocasia","Mawar");
        
    }
    
}
