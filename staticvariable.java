class Mobile{
    String name;
    int model;
    static String type;

    public void printer(){
        System.out.println(name+" "+model+" "+type);
    }
}
public class staticvariable {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.name = "Apple";
        m1.model = 5;

        Mobile m2 = new Mobile();
        m2.name = "Samsung";
        m2.model = 21;

        Mobile.type="Smartphone";

        m1.printer();
        m2.printer();

    }
}
