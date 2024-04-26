package prestudiesWeek2;

public class Using_Methods {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 2, 10, 11, 10};
        int multiplier = 2;

        System.out.println("Anwendung der Methode:");
        printMultipliedArray(numbers, multiplier);

        System.out.println("Werte von dem Array numbers :");
        for (int e : numbers) {
            System.out.print(e + " ");
        }
        System.out.print("\n");
        System.out.println("Faktor (\"multiplier\"): " + multiplier);
    }

    static void printMultipliedArray(int[] x, int multiplier) {
        multiplier += 1; // Increments the multiplier by 1
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * multiplier;
            /* Die Variable multiplier innerhalb der Methode printMultipliedArray ist lokal und
               wird um eins erhöht. Diese Änderung betrifft nur die Variable innerhalb der Methode
               und hat keinen Einfluss auf die Variable multiplier in der `main`-Methode,
               die ihren Wert von 2 behält. */
        }
        for (int e : x) {
            System.out.print(e + " ");
        }
        System.out.print("\n");
    }
}

/* Die Arrays bleiben gleich, weil in Java Arrays als Referenztypen
 behandelt werden, und somit Änderungen an einem übergebenen Array
 innerhalb einer Methode das ursprüngliche Array direkt beeinflussen.
 Um unabhängige Kopien zu erhalten, müssen explizit neue Arrays erstellt werden,
 die dann manipuliert werden können. ->  int[] copiedNumbers = numbers.clone();
 */