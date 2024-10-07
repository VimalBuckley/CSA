import java.util.Scanner;

public class MadLibs {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String incomplete = "";
        incomplete += "I went to the movies yesterday with <name> and <name>.\n";
        incomplete += "We saw <movie name>. It was <adjective>. At one part I even <verb> and ran for the <place>.\n";
        incomplete += "During the move, we ate <food> and <food>.\n";
        incomplete += "I got mad because the person sitting behind me kept <verb>\n";
        incomplete += "during the movie and wouldn't stop <verb>.\n";
        incomplete += "He was asked to leave after he <verb> across the theatre.\n";
        incomplete += "It was pretty <adjective>.\n";
        incomplete += "Overall, I liked the movie because it was <adjective>\n";
        incomplete += "and the main character was super <adjective>.\n";
        incomplete += "Hopefully next time the people sitting behind me\n";
        incomplete += "will be more <adjective>.";
        
        while (incomplete.contains("<")) {
            incomplete = step(incomplete);
        }
        System.out.println(incomplete);
    }

    public static String step(String incomplete) {
        int start = incomplete.indexOf("<");
        int end = incomplete.indexOf(">");
        String prompt = incomplete.substring(start + 1, end);
        System.out.print("Type in a(n) " + prompt + ": ");
        String answer = scanner.nextLine();
        String first = incomplete.substring(0, start);
        String second = incomplete.substring(end + 1);
        return first + answer + second;
    }
}
