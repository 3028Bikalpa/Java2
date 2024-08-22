public class ArrayandLoop {
    public static void mp(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0]=19;
        ages[1]=18;
        ages[2]=22;
        mp(ages[3]);
        mp(ages);
        mp(ages[10]);
        mp("Hi! we're here.");
    }
}
