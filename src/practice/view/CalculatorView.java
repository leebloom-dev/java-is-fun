package practice.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    /* FIELDS */
    private JTextField firstNumber = new JTextField(10); // 10 characters white
    private JLabel additionalLabel = new JLabel("+"); // input block
    private JTextField secondNumber = new JTextField(10);
    private JButton calculationButton = new JButton("Calculate"); // button
    private JTextField calcSolution = new JTextField(10);

    /* CONSTRUCTOR */
    public CalculatorView() {

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200); //(px width, px height)

        calcPanel.add(firstNumber);
        calcPanel.add(additionalLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculationButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);

    }

    /* METHODS: GETTERS AND SETTERS  */
    public int getFirstNumber() {
        // Converts user input String to Integer
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        // Converts user input String to Integer
        return Integer.parseInt(secondNumber.getText());
    }

    public void setCalcSolution(int solution) {
        // Converting Integer to String
        calcSolution.setText(Integer.toString(solution));
    }

    public void addCalculation(ActionListener listenForCalcButton) {
        calculationButton.addActionListener(listenForCalcButton);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
