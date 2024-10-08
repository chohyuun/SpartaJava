package Week01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String recipe = sc.next();
        float score = sc.nextFloat();
        String[] recipes = new String[10];

        for(int i = 0; i < 10; i++) {
            recipes[i] = sc.next();
        }

        score = (int)score;

        System.out.println("[ " + recipes + " ]");
        System.out.println("별점 : " + score  + '(' + score*100/5.0 + "%)");
        for(int i = 0; i < 10; i++) {
            System.out.println(i+1 + ". " + recipes[i]);
        }
    }
}
