class first{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Demo for data types
        short s = (short)100000; // This will take the number in a round order, the iteration of the numbers will start to repeat
        System.out.println("The short number is "+s);

        double a = 2.5, b = 2.5;
        int result = (int) (a*b); // In these sort of rounding the numbers, the number gets rounded down
        System.out.println("The converted result of the multiplication is "+result);

        //Conversion with characters
        char c = 'B';
        c = 88; //here we are assigning a number to the character type of variable
        System.out.println(c);
    }}