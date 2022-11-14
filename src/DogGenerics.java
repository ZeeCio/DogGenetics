import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class DogGenerics {
    public static void main(String[] args) {


        // System.out.println(Arrays.toString(dna));

        int max = 100;
        int min = 1;

        int firstRandomInt = new Random().nextInt(max - min) + min;


        int secondRandomInt = new Random().nextInt((max - firstRandomInt) - min) + min;


        int thirdRandomInt = new Random().nextInt((max - secondRandomInt) - min) + min;


        int forthRandomInt = new Random().nextInt((max - thirdRandomInt) - min) + min;


        int fifthRandomInt = new Random().nextInt((max - thirdRandomInt) - min) + min;


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your dog's name? ");
        String dogName = scan.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName +"'s prestigious background right here.");
        System.out.println();
        System.out.println("Sir Fluffy McFlufferkins Esquire is: ");
        System.out.println();
        System.out.println(firstRandomInt + "% St. Bernard");
        System.out.println(secondRandomInt + "% Chihuahua");
        System.out.println(thirdRandomInt + "% Dramatic RedNosed Asian Pug");
        System.out.println(forthRandomInt + "% Common Cur");
        System.out.println(fifthRandomInt + "% King Doberman");

        System.out.println();
        System.out.println("Wow, that's QUITE the dog! ");

    }
}