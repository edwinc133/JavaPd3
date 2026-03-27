import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Forest of Whispers!");
        System.out.println("You awaken at the edge of a mysterious forest.");
        System.out.println("A narrow path leads forward. Do you ENTER the forest or WALK away?");
        System.out.print("Type 'enter' or 'walk': ");
        String choice1 = scanner.nextLine().toLowerCase();

        if (choice1.equals("enter")) {
            System.out.println("\nYou step into the forest. The trees whisper your name.");
            System.out.println("Soon you reach a fork in the path.");
            System.out.print("Do you go LEFT toward the glowing light or RIGHT toward the dark cave? ");
            String choice2 = scanner.nextLine().toLowerCase();

            if (choice2.equals("left")) {
                System.out.println("\nThe light leads you to a clearing where a friendly spirit grants you a wish.");
                System.out.println("You win!");
            } else if (choice2.equals("right")) {
                System.out.println("\nThe cave is home to a sleeping dragon. It wakes up... and you run for your life!");
                System.out.println("Game over.");
            } else {
                System.out.println("\nYou hesitate too long. The forest shifts around you, and you become lost forever.");
            }

        } else if (choice1.equals("walk")) {
            System.out.println("\nYou walk away, choosing safety over adventure.");
            System.out.println("But the forest will remember your cowardice.");
        } else {
            System.out.println("\nYou stand still, unable to decide. The world fades to black.");
        }

        scanner.close();
    }
}
