public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
        //what i did above is just to initialize the field firstNumber to the same method variable in the constructor parenthesis
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if(secondNumber == 0) {
            return 0;
        }
        return firstNumber/secondNumber;
    }

}