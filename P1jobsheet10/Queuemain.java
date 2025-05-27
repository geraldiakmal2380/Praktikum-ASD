package P1jobsheet10;

import java.util.Scanner;

public class Queuemain {
    public static void menu(){
        System.out.println("Masukan operasi yang di inginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Print");
        System.out.println("4.peek");
        System.out.println("5.clear");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean perulangan = true;
        System.out.print("Masukan kapasistas queue : ");
        int n = sc.nextInt();
        Queue q = new Queue(n);

        do{
            menu();
            System.out.print("Masukan pilihan :  ");
            int pilihan = sc.nextInt();
            switch (pilihan){
                case 1:
                    System.out.print("Masukan data baru : ");
                    int datamasuk = sc.nextInt();
                    q.Enqueue(datamasuk);
                    break;
                case 2:
                    int datakeluar = q.Dequeue();
                    if(datakeluar!=0){
                        System.out.println("Data yang dikeluarkan adalah : "+datakeluar);
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
                default:
                    break;
            }
        }while (perulangan);


    }
}

