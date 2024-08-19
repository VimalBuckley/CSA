public class CompoundOperators {
    public static void main(String[] args) {
        int numPeople = 0;
        double totalYears = 0;
        double myYears = 11.5;
        double bobYears = 10.5;
        double aliceYears = 9.5;
        double dylanYears = 12.5;
        totalYears += myYears;
        numPeople++;
        totalYears += bobYears;
        numPeople++;
        totalYears += aliceYears;
        numPeople++;
        totalYears += dylanYears;
        numPeople++;

        double gradYear = 13;

        System.out.println("I have "+ myYears + " years in school. Years until I graduate: " + (gradYear - myYears));
        System.out.println("Bob has "+ bobYears + " years in school. Years until Bob graduates: " + (gradYear - bobYears));
        System.out.println("Alice has "+ aliceYears + " years in school. Years until Alice graduates: " + (gradYear - aliceYears));
        System.out.println("Dylan has "+ dylanYears + " years in school. Years until Dylan graduates: " + (gradYear - dylanYears));
        System.out.println("Total people: " + numPeople + ", total years: " + totalYears);
        System.out.println("We have been in school for an average of " + totalYears / 4 + " years.");
        System.out.println("We have spent " + totalYears * 180 + " days in school.");
        System.out.println("We have spent an average of " + totalYears * 180 / 4 + " days in school.");

        /*
        * TODO 1) Add at least three other people to your program,
        * such as siblings, friends, or neighbors. 
        *
        * TODO 2) Use people that are in different grades to validate
        * your program can work for different school grades. 
        * 
        * TODO 3) For their years in school, use values that indicate 
        * they will soon be halfway through their current
        * school year, as shown in the provided code.
        */

        /*
        * TODO 4)The average years you and your friends, siblings,
        * neighbors have been in school. 
        *
        * TODO 5) The total days you have all been in school,
        * assuming you spend 180 days per year in school.
        * 
        * TODO 6) The average days you have all spent in school. 
        */
    }
}
