import java.util.Scanner;

public class kodeplat {//array plat nomor dan input volume kubus
    public static void main(String[] args) {
        Scanner yum = new Scanner(System.in);
        char[] kode = {'A','B','D','E','F','G','H','L','N','T'};
        char namakota[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
            };

            char pilihan;
            String stringpilihankechar;
            int kykegakono=0;

        System.out.print("Masukan kode plat nomor : ");
            stringpilihankechar = yum.nextLine().toUpperCase();
            pilihan = stringpilihankechar.charAt(0);

            for (int i =0;i <kode.length;i++){
                if(pilihan == kode[i]){
                    for (int j=0;j<namakota[i].length;j++){
                        System.out.print(namakota[i][j]);
                    }
                    break;
                }
                else{
                    System.out.println("Membaca ke-"+i);
                    kykegakono++;
                }
                
            }
            if(kykegakono == 11){
                System.out.println("Sepertinya kode plat tidak ada dalam data");
            }
            yum.close();
            //ini biarin aja
            /* 
            for(int i=0;i<namakota.length;i++){
                System.out.println(namakota[i].length);
            }
            */

    }
}
