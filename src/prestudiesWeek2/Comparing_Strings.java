package prestudiesWeek2;

public class Comparing_Strings {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str = new String("Hello World");
        System.out.println(str1.equals(str));
        System.out.println(str1 == str);
        /* str1.equals(str) ist true, da der Inhalt der Zeichenketten gleich ist.
        str1 == str ist false, da die Referenzen auf unterschiedliche Objekte verweisen. */
    }
}
