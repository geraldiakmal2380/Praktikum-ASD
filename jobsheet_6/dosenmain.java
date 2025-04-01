package jobsheet_6;

import java.util.Scanner;

public class dosenmain {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        dosen object = new dosen();

        
        //true = laki2,false = perempuan
        dosen a = new dosen("Andre","b",true,12);
        dosen b = new dosen("budi","b",true,12);

        object.tambahdata(a);
        object.tambahdata(b);

        System.out.println("Data sebelum di sorting ");
        object.tampil();

    
    }
}
