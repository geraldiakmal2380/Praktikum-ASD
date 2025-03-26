package jobsheet_6;

public class Sortingmain10 {
      
    public static void main(String[] args) {
    int a[] = {20,10,2,7,12};
    int b[] = {30,20,2,8,14};
    sorting10 dataurut1 = new sorting10(a,a.length); 
    sorting10 dataurut2 = new sorting10(b,b.length);

    System.out.println("Data awal 1");
    dataurut1.tampil();
    dataurut1.bubleshort();
    System.out.println("data sudah diurutkan dengan bubble short (ASC)");
    dataurut1.tampil(); 
    System.out.println("=========================================");

    System.out.println("Data awal 2");
    dataurut2.tampil();
    dataurut2.selectionsort();
    System.out.println("Data sudah diurutkan dengan selection sort (ASC)");
    dataurut2.tampil();

    }
}
