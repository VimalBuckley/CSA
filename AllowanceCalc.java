

public class AllowanceCalc {
    public static void main(String[] args) {
        System.out.println(new Child("Gina", 16));
        System.out.println(new Child("Carl", 13));
        System.out.println(new Child("Jennifer", 3));
    }
    public static class Child {
        private final String name;
        private final int age;
        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            String ageString = name + " is " + age + " years old.\n" ;
            String oldEnoughString = name + (age < 8 ? " isn't" : " is") + " old enough to have an allowance. \n";
            String allowanceString = name + "'s weekly allowance is: " + (age < 8 ? "$0." : "$8.75.") + "\n";
            return ageString + oldEnoughString + allowanceString;
        }
    }
}
