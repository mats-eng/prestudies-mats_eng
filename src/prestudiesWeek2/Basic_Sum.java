package prestudiesWeek2;

public class Basic_Sum {
    public static void main(String[] args) {
        int sum = 0;
        int [] numbers = new int [] {12, -22, 300, 43, 0};
        for (int e : numbers){
            sum += e;
        }
        System.out.println(sum);

        //Question to thin about and discuss with your studdy buddy:
        int [] testnumb1 = {30, 49, 9, 2, 6};
        int [] testnumb2 = testnumb1;

        testnumb2[1] = 1;
        System.out.println(testnumb1[1]);
    }
}

/* Arrays sind Referenzdatentypen. Variablen, die Arrays enthalten, verweisen auf das Objekt im Speicher.
Ändere ich einen Wert des Arrays, so verändere ich die Werte im Speicher. Alle Variablen,
die auf dasselbe Array verweisen, verweisen nun auch auf veränderte Daten.
Die Werte eines Arrays sind nicht konstant.
 */