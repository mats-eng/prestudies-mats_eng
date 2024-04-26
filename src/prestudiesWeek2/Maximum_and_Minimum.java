package prestudiesWeek2;

public class Maximum_and_Minimum {
    public static void main(String[] args) {
        int [] numbers = new int [] {12, -22, 300, 43, 0};

        int largestNumb = numbers[0];
        int smallestNumb = numbers[0];

        for (int e : numbers){
            if(e > largestNumb){
                largestNumb = e;
            }
            if(e < smallestNumb){
                smallestNumb = e;
            }
        }
        System.out.println(largestNumb);
        System.out.println(smallestNumb);
    }
}
