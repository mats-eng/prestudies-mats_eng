package prestudiesWeek1;

public class Data_types {
    public static void main(String[] args) {
        char[] initials                 = {'M', 'E'};
        int populationGermany           = 84600000;
        long populationEarth            = 8020000000L;
        boolean isCurrentlyDaytime      = true;
        double marioGomezBayernMunichGSQ = Math.round(113.0/174.0 * 1000.0) / 1000.0;
        byte javaProgramDurationInWeeks = 12;
        double pi                       = Math.PI;

        System.out.println("My name is Mats, my initials are: " + initials[0] + initials[1] +
                " and i live in Germany. Germany has " + populationGermany/1000000 + " million inhabitants. " +
                "\nThat's not many. On Earth we have " + populationEarth/1000000000 + " billion inhabitants. " +
                "\nA nice day to watch soccer, isn't it? " + isCurrentlyDaytime + ". You know Mario Gomez?" +
                "\nIf not, he is a very talented soccer professional. He has a Goal Strike Quote of " + marioGomezBayernMunichGSQ + ".\nI'm very excited, what i will learn " +
                "in the next " + javaProgramDurationInWeeks + " during the JavaProgram.\nI can already represent π in numbers: " +
                pi + ". Isn't that cool?!");
    }
}
