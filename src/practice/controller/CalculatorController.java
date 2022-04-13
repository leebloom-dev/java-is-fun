package practice.controller;

import practice.model.CalculatorModel;
import practice.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    /* FIELDS */
    private CalculatorView theView;
    private CalculatorModel theModel;

    /* CONSTRUCTOR */
    public CalculatorController(CalculatorView theView, CalculatorModel theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());

    }

    // Inner Class/controller, to listen for what's going on in the view
    class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent arg0) {

            int firstNumber, secondNumber = 0;

            // Since we don't know if user will enter all inputs
            try {

                // get values from CalculatorView
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                // using method from CalculatorModel for calculation
                theModel.addTwoNumbers(firstNumber, secondNumber);

                // set Calculated solution in VIEW by getting calculation from MODEL
                theView.setCalcSolution(theModel.getCalculationValue());

            // Triggers error when user do not enter number in one part of calculator
            } catch (NumberFormatException exception) {

                theView.displayErrorMessage("You Need To Enter 2 Integers.");

            }

        }

    }

}
