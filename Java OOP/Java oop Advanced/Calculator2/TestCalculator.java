public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperand1(10.5);
        calculator.setOperand2(5.2);
        calculator.setOperation("+");
        calculator.performOperation();
        calculator.getResults();
    }
    
}
