package practice.model;

public class CalculatorModel {

    /* FIELDS */
    private int calculationValue;

    /* METHODS */
    public void addTwoNumbers(int firstNumber, int secondNumber) {

        calculationValue = firstNumber + secondNumber;

    }

    public int getCalculationValue() {

        return calculationValue;

    }

}
