import java.util.Random;
import java.util.Scanner;

class OasisInfoByte2 {
    public static void main(String[] args) {
        Random Number = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number");
        int num = 0;
        int Try=5;
        int score=0;
        num = Number.nextInt(10);
        for (int i = 0; i < Try; i++) {
            int guessNum = sc.nextInt();
            score=Try-i;
            if (num == guessNum) {
                System.out.println("Number matches");
                System.out.println("Your Score is "+score+"/5");
            }
            if (num >guessNum) {
                System.out.println("Your Number is smaller");
            }
            if (num < guessNum) {
                System.out.println("Your number is bigger ");
            }

        }
        System.out.println();
        System.out.println("You have reached limits");
        System.out.println("Your Score is "+score+"/5");
    }
}