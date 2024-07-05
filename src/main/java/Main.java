import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
    Random random = new Random(); // create object 'random'
    Scanner input = new Scanner(System.in); // create scanner object 'input' for user input
    HashSet<Integer> guessCounter = new HashSet<>();
    int randomNumber = random.nextInt(5) + 1; // generates random number between 0-4, +1 for bounds to include 1-5
    int guess = 0; // stores current guess to compare with randomNumber

    System.out.println("Guess a number between 1 and 5: ");

    while (guess != randomNumber){ // initiates conditional for while loop
        guess = input.nextInt(); // scans input
        if (guess > randomNumber) { // if guess is less than randomly generated number
            System.out.println("Guess lower:");
            guessCounter.add(guess); // adds guess to HashSet
        } else if (guess < randomNumber) {
            System.out.println("Guess higher:");
            guessCounter.add(guess); // adds guess to HashSet
        } else {
            System.out.println("Congrats! " + guess + " is the number! You guessed " + guessCounter.size() + " times.");
            }
        }
    }
}
