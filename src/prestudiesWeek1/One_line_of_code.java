package prestudiesWeek1;

public class One_line_of_code {
    public static void main(String[] args) {
        //Aufgabe
        double x = 15.5;
        double a = Math.sqrt(3.5 + x);
        double b = a * 5;
        double c = b / 3;
        double d = x + 10;
        double e = x - 4.1;
        double f = d * e;
        double g = c - f;
        System.out.println(g);

        //Lösung in einer Zeile
        System.out.println((Math.sqrt(3.5 + 15.5) * 5.0) / 3.0 - (15.5 + 10.0) * (15.5 - 4.1));

        //Test
        System.out.println(g == (Math.sqrt(3.5 + 15.5) * 5.0) / 3.0 - (15.5 + 10.0) * (15.5 - 4.1));
    }
}