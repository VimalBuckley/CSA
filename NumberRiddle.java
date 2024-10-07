public class NumberRiddle {
    public static void main(String[] args) {
        int input = 3;
        int ogInput = input;
        System.out.print("Your number was: ");
        System.out.print(input);
        System.out.println(".");
        input*=2;
        System.out.println("First we double your number to get : " + input + ".");
        input+=6;
        System.out.println("Then we add six, which gives: " + input + ".");
        input/=2;
        System.out.println("Then we half you number, and get: " + input + ".");
        input -= ogInput;
        System.out.print("Finally we subtract your original number: " + ogInput);
        System.out.println(" to get: " + (double) input + "!");
        System.out.print("What a shocker!");
    }
}
