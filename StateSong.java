public class StateSong {
    public static void main(String[] args) {
        String line1 = "Hush a bye my baby s" + 1 + "umber time is coming soon\n";
        String line2 = new String("Rest your head on mommie's breast while daddy hums a tune");
        String lines2and3 = line2.concat("\nAre the old folks were humming the banjos were strumming");
        String line4 = "\n\tAnd the soft breezes \"sigh\" as in days long gone by";
        String wholeSong = line1 + lines2and3;
        wholeSong += line4;
        System.out.println(wholeSong);
    }
}
