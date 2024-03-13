import java.util.Scanner;

public class A3Q4 {
    public static void main(String[] args) {
        // Generate a random number between 1 and 9
        int computerNumber = (int) (Math.random() * 9);
        System.out.println(computerNumber);
        // Ask the user to guess a number between 1 and 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 9: ");
        int userGuess = scanner.nextInt();
        
        // Check if the user's guess is correct, close, or wrong
        if (userGuess == computerNumber) {
            System.out.println("You got it right!");
        } else if (userGuess >= computerNumber - 1 && userGuess <= computerNumber + 1) {
            System.out.println("Almost got it!");
        } else {
            System.out.println("You got it wrong. The correct number was " + computerNumber);
        }
        
        // Close the scanner
        scanner.close();
    }
}
