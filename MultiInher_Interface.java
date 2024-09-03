public class MultiInher_Interface {
    public static void main(String[] args) {
        //Child c = new Child(); this will call default constructor
        Child c = new Child("Jingrui");
        System.out.println("The name is: "+c.name);

        Whale w = new Whale();
        w.giveBirth();
        w.swim();

        System.out.println(w.name);
    }
}

interface Mammal{
    public void giveBirth();
    final static String name = "Cheng Binghan";

    // public void produceMilk();
}

interface MarineAni{
    public void swim();
}

class Whale implements Mammal, MarineAni{
    public void giveBirth(){
        System.out.println("Hi thi is giveBirth.");
    }
    public void swim(){
        System.out.println("Hi, this is swim");
    }
}

class Mum{
    String name;
    Mum(String n) {name = n;}
    Mum(){System.out.println("in the Mum()!");}
}

class Dad{
    String name;
    Dad(String n){name = n;}
}

class Child extends Mum{
    Child(String n){
        // super(n); //This is to call parent's class constructor
    }
}

//Why does Java not support multiple parents class? How does other languages support multiple parent class?
