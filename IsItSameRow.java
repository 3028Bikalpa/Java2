import java.util.Scanner;

public class IsItSameRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word for which you want to check: ");
        String word = sc.nextLine();
        word = word.toLowerCase();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        boolean row1 = false;
        boolean row2 = false;
        boolean row3 = false;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (first.contains(String.valueOf(c))) row1 = true;
            if (second.contains(String.valueOf(c))) row2 = true;
            if (third.contains(String.valueOf(c))) row3 = true;
        }
        if ((row1 && !row2 && !row3) || (!row1 && row2 && !row3) || (!row1 && !row2 && row3)) {
            System.out.println("Yes, it is from the same row of keys");
        } else {
            System.out.println("No it is not from the same row of keys");
        }
    }
    }

