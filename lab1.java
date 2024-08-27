

//a static method is also called class wide method

public class lab1 {
    public static void myP(Object o) {
        System.out.println(o);
    }

    public void say (Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        // System.out.println("Hello, Online Judge!");


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number that you want to give as input");
        // int a= sc.nextInt();
        // System.out.println("The number that you entered is " +a);


        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the two numbers that you want to add: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("The sum of the numbers that you provided is: "+sum);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the score that you want to check for the grade: ");
        // float score = sc.nextFloat();
        // if(score>=98){
        //     System.out.println("A+");
        // }
        // else if(score>=93&&score<98){
        //     System.out.println("A");
        // }
        // else if()

        String s1 = "cs201 is a good course";
        char c1 = s1.charAt(4);
        myP(c1);


        Bird b1 = new Bird(); //first bird created
        b1.name = "1stGuy";
        b1.age = 2;
        b1.food = new FOOD();
        b1.spec = new Species();
        //need to work to remove the red mark of error from f1



        Bird b2 = new Bird();

        //b1.BadBird();


        Bird b3 = new Bird("Micheal", 3);

        lab1.myP(b3);
    }
}


class Bird{
    String name;
    int age;
    FOOD food;
    Species spec;

    //a constructor
    void BadBird(){ //if we have a return type, this method is not a constructor but a normal methodthathas the same name as the class! Also, void is not needed here
        lab1.myP("A normal method with the name Bird");
    }

    //a default constructor
    Bird(){
        lab1 dp = new lab1();
        dp.say("Hi! this is the constructor class bird");
    }

    //a parameterized constructor
    Bird(String name, int age){
        //we could initialize the object
        this.name = name; //use the key this to tell the variable isan attributeof the class
        this.age = age;
    }

    void fly(int distance)
    {
        lab1.myP("This bird is flying");
    }
    void eat(FOOD f){
        lab1.myP("This bird is eating food");
        lab1.myP("This bird is eating "+f.weight+f.name);
    }
}

class FOOD{
    String name = "insect";
    int weight=10;
}

class Species{
}
