import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner mlebu = new Scanner(System.in);
        int angka;
        String binary= "";

        System.out.print("Masukan angka : ");
        angka = mlebu.nextInt();
        mlebu.nextLine();

        if(angka == 0){
            System.out.println("Binary dari 0 adalah 0");
        }
        else {
            int remainder = angka;
            while (remainder > 0){
            int biner = remainder %2;
            
            }
        }

    }
}
