package prestudiesWeek2;

public class Calculator {
    private int number;

    public void plus(int number) {
        this.number += number;
    }

    public void multiply(int number) {
        this.number *= number;
    }

    public void divide(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        this.number /= number;
    }

    public int getResult() {
        return number;
    }
}