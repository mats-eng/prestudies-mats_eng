package prestudiesWeek2;

public class Christmas_tree {
    public static void main(String[] args) {
        int counter = 1;
        int z;
        int i;
        int j;
        int k = 4;
        for (j = 5; j > 0; j--) {
            for (i = k; i > 0; i--) {
                System.out.print(" ");
            }
            for (z = counter; z > 0; z--) {
                System.out.print("*");
            }
            System.out.print("\n");
            k--;
            counter += 2;
        }
        System.out.println("    *    ");
    }
}
