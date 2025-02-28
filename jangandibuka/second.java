

public class second {
    String kedua = "Ini adalah kelas ke 2";
    public static void main(String[] args) {
        main objeklagi = new main();
        second objeksecond = new second();
        //kita juga bisa modifikasi nilai dari objek
        //objeklagi.x = 50;//sekarng nilainya akan 50
        System.out.println(objeklagi.x);
        System.out.println("Nama saya adalah "+objeklagi.nama);
        System.out.println("Umur saya adalah "+objeklagi.umur);
        System.out.println(objeksecond.kedua);
    }
}
