

public class OOP{

    //a static method, is also called class wide method
    public static void print(Object o){
        System.out.println(o);
    }

    //instance wide 
    public void say(Object o){
        System.out.println(o);
    }
    public static void main(String[] args){

        String s1 = "cs201 ";
        char c1 = s1.charAt(0);
        print(c1);

        Bird b1 = new Bird();//first bird created
        
        b1.setName("1stbird");
        // b1.name = "1stGuy";
        b1.food.name = "f1";
        b1.food.weight = 2;
        b1.food.time = true;
         
        
        b1.spec = new Species();


        FOOD f2 = new FOOD();
        f2.name = "burger";
        f2.weight = 1;
        b1.food = f2;


        Bird b2 = new Bird();
        Bird b3 = new Bird();
        // Bird b3 = new Bird("Michale", 3);
        b3.setName("errorBird");
        OOP.print(b3.getName);
        // OOP.print(b3.name);

        OOP.print(Bird.numBirds);

        //b1.BadBird();

        //we'll create some sea bird here
        SeaBird sb1 = new SeaBird();
        sb1.setSpeed(30);
        Fish f = new Fish();
        f.name("carp");

        sb1.setFish(f);
        

    }
}

class SeaBird extends Bird{
    //additional attributes
    private float swimmingSpeed;
    private Fish fishToEat;
    private Habitat hab; //where the bird is

    //additional method for additional attributes
    //getters
    public float getSpeed(){return swimmingSpeed;}
    public Fish getFish(){return fishToEat;}

    //setters
    public void setSpeed(float s){swimmingSpeed = s;}
    public void setFish(Fish f){fishToEat = f;}
}
class Habitat{

}
class Fish{
    //forgot what was written here
}

class Bird{
    private String name;
    private int age;
    FOOD food;
    Species spec;
    static int numBirds; //class wide attribute

    //add public method to access the private attribute
    public String getName() {return name;}
    public void setName(String newName){name = newName;}
    public void setAge(int a){age = a;}

    void BadBird(){
        OOP.print("a normal method with the name BadBird");
    }

    //a defaul tconstructor
    Bird(){
        numBirds++;
        OOP.print("hi, this is the constructor the class Bird");
        OOP dp = new OOP();
        dp.say("");
    }
    //a parameterized constructor
    Bird(String name, int age){
        numBirds++;
        //we could initialize the object
        this.name = name;//use the key this to tell the bariable is an attribute of the class
        this.age = age;


    }

    void fly(int distance){
        OOP.print("This bird is flying");
    }
    void eat(FOOD f){
        OOP.print("This bird is eating food" + f);
        if (f.time){
            OOP.print("This bird is eating " + f.weight + f.name);
        } else {
            OOP.print("not to eat now");
        }
    }
}

class FOOD{
    String name;
    int weight;
    boolean time; 
}

class Species{

}