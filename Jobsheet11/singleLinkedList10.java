package Jobsheet11;

public class singleLinkedList10 {
    node10 head;
    node10 tail;

    boolean isEmpty(){
        return (head==null);
    }

    public void print(){
        if(!isEmpty()){
            node10 tmp = head;
            System.out.println("Isi linked list : \t");
            while (tmp != null){
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa10 input){
        node10 nInput = new node10(input,null);
        if(isEmpty()){
            head = nInput;
            tail = nInput;
        }else {
            nInput.next = head;
            tail = nInput;
        }
    }

    public void addLast(Mahasiswa10 input){
        node10 ndInput = new node10(input, null);

        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void inserAfter(String key,Mahasiswa10 input){
       node10 ndInput = new node10(input,null);
       node10 temp = head;
       do{
           if(temp.data.nama.equalsIgnoreCase(key)){
               ndInput.next = temp.next;
               temp.next = ndInput;
               if(ndInput.next == null){
                   tail = ndInput;
               }
               break;
           }
           temp = temp.next;
       }while (temp !=null);
    }

    public void insertAt(int index, Mahasiswa10 input){
        if(index <0){
            System.out.println("Index salah");
        }else if(index==0){
            addFirst(input);
        }else {
            node10 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new node10(input,temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
