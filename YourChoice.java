import java.util.HashMap;
import java.util.Scanner;

public class YourChoice {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        makeChoice(
            "You wake up. You realize there are zombies. Do you leave your house or go back to sleep?"
        ).addPath(
            "SLEEP",
            makeEnding("Your house fell down, but you were asleep :( You died")
        ).addPath(
            "LEAVE", 
            makeChoice(
                "Do you go to school or the police station. Or the sky"
            ).addPath(
                "SKY",
                makeEnding("You've gained omnipotence. Good job")
            ).addPath(
                "POLICE STATION",
                makeEnding("A t-rex fell on you :( You died")
            ).addPath(
                "SCHOOL", 
                makeChoice(
                    "Do you do your homework for school?"
                ).addPath(
                    "YES", 
                    makeEnding(
                        "While you were focused on your homework, a zombie snuck up on you and bit you :( You died"
                    )
                ).addPath(
                    "NO", 
                    makeEnding(
                        "You notice a zombie sneaking up on you and are able to escape. Then all the zombies disappear. You win :)"
                    )
                )
            )
        ).continueStory();
    }

    public static Choice makeChoice(String prompt) {
        return new Choice(prompt);
    }

    public static End makeEnding(String message) {
        return new End(message);
    }

    public static interface Node {
        public void continueStory();
    }

    public static class Choice implements Node {
        private String prompt;
        private HashMap<String, Node> answerMap;

        public Choice(String prompt) {
            this.prompt = prompt;
            answerMap = new HashMap<>();
            answerMap.put("QUIT", new End("You quit :("));
        }

        public Choice addPath(String answer, Node next) {
            answerMap.put(answer, next);
            return this;
        }

        @Override
        public void continueStory() {
            System.out.println();
            System.out.println(prompt);
            System.out.println("Choices: " + answerMap.keySet());
            String answer = scanner.nextLine().toUpperCase();
            while (!answerMap.keySet().contains(answer)) {
                System.out.println("That is not a valid choice!");
                System.out.println("\n" + prompt);
                System.out.println("Choices: " + answerMap.keySet());
                answer = scanner.nextLine();
            }
            answerMap.get(answer).continueStory();
        }
    }

    public static class End implements Node {
        private String message;

        public End(String message) {
            this.message = message;
        }

        @Override
        public void continueStory() {
            System.out.println();
            System.out.println(message);
            System.out.println("Story Over!");
        }
    }
}
