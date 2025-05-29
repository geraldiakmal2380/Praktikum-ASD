package P1jobsheet10;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukan operasi yang di inginkan : ");
        System.out.println("1. Enqueue (menyisipkan elemen di belakang antrean)");
        System.out.println("2. Dequeue (proses untuk menghapus data dari antrean)");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. clear");
        System.out.println("-------------------------------------");
        System.out.print("Masukan operasi yang di inginkan(1/2/3/4/5) : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean perulangan = true;
        int pilih;


        System.out.print("Masukan kapasitas Queue : ");
        int kapasitas = sc.nextInt();
        Queue Q = new Queue(kapasitas);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukan data baru : ");
                    int datamasuk = sc.nextInt();
                    Q.enqueue(datamasuk);
                    break;
                case 2:
                    int datakeluar = Q.dequeuue();
                    if (datakeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + datakeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.println("Bye");
                    perulangan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (perulangan);
    }
}
