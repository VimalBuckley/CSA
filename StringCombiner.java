public class StringCombiner {
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "dog";
        int length1 = str1.length();
        int length2 = str2.length();
        if (length2 % 2 != 0) {
            length2++;
        }
        String substr1 = str1.substring(0, length1 / 2);
        String substr2 = str2.substring(length2 / 2);
        String combined = substr1 + substr2;
        System.out.println(combined);
    }
}