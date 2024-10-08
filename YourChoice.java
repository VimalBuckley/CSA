import java.util.HashMap;
import java.util.Scanner;

public class YourChoice {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("You were kidnapped. Escape the maze to survive!");
        new Choice(
            "Test"
        ).addPath(
            "Choice 1",
            new End("End 1")
        ).addPath(
            "Choice 2",
            new Choice(
                "Test 2"
            ).addPath(
                "Choice 3",
                new End("End 2")
            )  
        ).run();
    }

    public static class Choice implements Runnable {
        private String prompt;
        private HashMap<String, Runnable> answerMap;

        public Choice(String prompt) {
            this.prompt = prompt;
            answerMap = new HashMap<>();
            answerMap.put("QUIT", new End("You quit :("));
        }

        public Choice addPath(String answer, Runnable next) {
            answerMap.put(answer, next);
            return this;
        }

        @Override
        public void run() {
            System.out.println();
            System.out.println(prompt);
            System.out.println("Choices: " + answerMap.keySet());
            String answer = scanner.nextLine();
            while (!answerMap.keySet().contains(answer)) {
                System.out.println("That is not a valid choice!");
                System.out.println("\n" + prompt);
                System.out.println("Choices: " + answerMap.keySet());
                answer = scanner.nextLine();
            }
            answerMap.get(answer).run();
        }

    }

    public static class End implements Runnable {
        private String message;

        public End(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println();
            System.out.println(message);
            System.out.println("Story Over!");
        }

    }
}
