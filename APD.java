public class APD {
    public static void main(String[] args) {
        System.out.println("good");

        //see how polymorphism works
        Musician[] mu = new Musician[4];
        mu[0]=new Pianist();
        mu[1]=new Guitarist();
        mu[2]=new Violinist();
        mu[3]=new Pianist();
        for (int i = 0; i < mu.length; i++) {
            mu[i].play();
        }
    }
}

abstract class Shape{
    String name;
    double area;


    abstract double calculateArea();
    // {
    //     //
    // }
}

class Square extends Shape{ //this class is defined by Chris
    int size;
    double calculateArea(){
        area = size*size;
        return area;
    }
}

abstract class Musician{
    abstract void play();
}

class Pianist extends Musician{
    void play() {System.out.println("a pianist is playing");}
}

class Guitarist extends Musician{
    void play() {System.out.println("a guitarist is playing");}
}

class Violinist extends Musician{
    void play() {System.out.println("a violinist is playing");}
}

class Circle extends Shape{ //this class is defined by Xinyi
    int radius;
    double calculateArea(){
        area = radius*radius*Math.PI;
        return area;
    }
}
