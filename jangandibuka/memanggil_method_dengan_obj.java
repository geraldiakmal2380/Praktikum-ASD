//memanggil fungsi atau method dengan object
package jangandibuka;
public class memanggil_method_dengan_obj{
    public void tidurjam9malam(){
        System.out.println("Saya malam ini akan tidur jam 9 malam");
    }
    
    public void jamberapasayatidur(int jamtidur){
        System.out.println("Saya ternyata tidur jam "+jamtidur);
    }

    public static void main(String[] args) {
        memanggil_method_dengan_obj iniadalahobjek = new memanggil_method_dengan_obj();
        iniadalahobjek.tidurjam9malam();
        iniadalahobjek.jamberapasayatidur(3);
    
    }
        
}