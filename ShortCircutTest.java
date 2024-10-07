public class ShortCircutTest {
    public static void main(String[] args) {
        System.out.println("False and True:");
        System.out.println("Result:" + (falsePrint() && truePrint()));
        System.out.println("True and False");
        System.out.println("Result:" + (truePrint() && falsePrint()));
        System.out.println("False or True");
        System.out.println("Result:" + (falsePrint() || truePrint()));
        System.out.println("True or False:");
        System.out.println("Result:" + (truePrint() || falsePrint()));
    }

    public static boolean falsePrint() {
        System.out.println("false");
        return false;
    }

    public static boolean truePrint() {
        System.out.println("true");
        return true;
    }
}
