public class RecursionDemo{
    public static void main(String[] args){
        // RecursionDemo rd = new RecursionDemo();
        // rd.speakToMyself("How are you today?", 1);
        // int a = 5;
        // int ans = factorial (a);
        // System.out.println(ans);
        int a = 0;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 3; i++) {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    
    
    // void speakToMyself(String msg, int count){
    //     System.out.println(count);
    //     try{
    //         speakToMyself(msg, count+1); 
    //     } catch (Error e){
    //         System.out.println(e.getMessage());
    //     }
    // }

    // static int factorial(int n)
    // {
    //     if(n>1){
    //         return n*factorial(n-1);
            
    //     }else{
    //         return 1;
    //     }
    // this is the program for finding the factorial of a number using recursionx
}
    