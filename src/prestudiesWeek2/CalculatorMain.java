package prestudiesWeek2;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.plus(8);
        myCalculator.multiply(2);
        myCalculator.divide(4);
        System.out.println(myCalculator.getResult());
    }
}
