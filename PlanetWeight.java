public class PlanetWeight {
    public static void main(String[] args) {
        double earthGravity = 9.81;
        double mercuryRatio = 3.59 / earthGravity;
        double marsRatio = 3.711 / earthGravity;
        double saturnRatio = 11.08 / earthGravity;
        double earthWeight = 177;
        System.out.println("This person weights " + earthWeight * marsRatio + " lbs on Mars!");
        System.out.println("This person weights " + earthWeight * mercuryRatio + " lbs on Mercury");
        System.out.println("This person weights " + earthWeight * saturnRatio + " lbs on Saturn");
        System.out.print("This person's average weight accross the planets chosen is: ");
        System.out.println(earthWeight * (marsRatio + mercuryRatio + saturnRatio) / 3 + " lbs!");
    }
}