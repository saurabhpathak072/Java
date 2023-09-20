package OOPS.SimpleCalculator;

public class Calculator {
    private double firstNumber = 0d;
    private double secondNumber = 0d;
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return Math.abs( this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult(){
        return  this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult(){
        if(this.secondNumber == 0)
            return 0d;
        else return this.firstNumber/this.secondNumber;
    }

}
