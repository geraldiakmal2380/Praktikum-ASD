import java.util.Scanner;

public class Pertanyaan5 {//array plat nomor dan input volume kubus
    public static void main(String[] args) {
        Scanner yum = new Scanner(System.in);
        char[] kode = {'A','B','C','D','E','F','G','H','L','N','T'};
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

            String pilihan;

        System.out.println("Masukan kode plat nomor : ");
        System.out.println("kode.length adalah "+kode.length);
        System.out.println(namakota[0].length);
        do{
            pilihan = yum.nextLine();//input dengan string yang akan nanti di konvert ke char
            char pilihanchar = ((char)pilihan.toUpperCase().charAt(0));//ini proses konvert ke char
            for(int i=0;i<kode.length;i++){//proses mencari inputan user 
                if (pilihanchar == kode[i]) {
                    System.out.println(namakota[i].length);
                    for(int j=0;j<namakota[i].length;j++){
                        System.out.print(namakota[i][j]);
                        
                    }
                    
                }
                else{
                    System.out.println("Membaca ke"+i);
                }
            }

        }while(true);
        



    }
}
