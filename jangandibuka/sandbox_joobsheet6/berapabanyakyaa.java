package sandbox_joobsheet6;

public class berapabanyakyaa {
    public static void main(String[] args) {
        int[] array = new int[50];
        int count1=0;
        int count2=0;

        for(int i=0;i<array.length-1;i++){
            count1++;
            for(int j=1;j<array.length-i;j++){
                count2++;
            }
        }

        System.out.println("Count1 : "+count1+" Count2 : "+count2);
        System.out.println("Count1+Count2 = "+(count1+count2));
    } 
}
