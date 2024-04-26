package prestudiesWeek2;

public class String_Manipulation {
    public static void main(String[] args) {
        String mainString = "Everybody said, it can't be done. Then came one who did not know that and just made it.";
        System.out.println(mainString.charAt(0) + "," + mainString.charAt(34));
        System.out.println(mainString.compareTo("Mats")); // "Compares two strings lexicographically."
        // "The comparison is based on the Unicode value of each character in the strings."
        // Die ASCII-Werte der Zeichen werden miteinander verglichen, ist alles gleich, dann wird eine 0 ausgegeben.
        // Unterschieden diese sich werden die ersten unterschiedlichen Zeichen miteinander verglichen: Hier E und M, also 69 und 77.
        // Die Differenz der ASCII-Werte werden dann rausgegeben.

        String firstName = "Mats";
        String lastName = "Engbers";
        System.out.println(firstName.concat(lastName));

        System.out.println(mainString.contains("made"));
        System.out.println(mainString.contains("Java"));

        System.out.println(mainString.equals(lastName));

        System.out.println(mainString.indexOf("d"));

        System.out.println("".isEmpty());

        String nullReference = null;
        System.out.println(nullReference == null);

        System.out.println(mainString.length());

        System.out.println(mainString.substring(10, 14));
        System.out.println(mainString.substring(79, 84));

    }
}
