public class MultiInher_Interface {
    public static void main(String[] args) {
        //Child c = new Child(); this will call default constructor
        Child c = new Child("Jingrui");
        System.out.println("The name is: "+c.name);
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
