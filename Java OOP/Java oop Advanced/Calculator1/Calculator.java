public class Calculator {

    private double operandOne = 0;
    private double operandTwo = 0;
    private String operation = "";

    public double performOperation(){
        if (operation == "+"){
            return (operandOne+operandTwo);
        }else if(operation == "-"){
            return (operandOne-operandTwo);
        }else{
            System.out.println("Wrong operation default result 0.0");
            return (0.0);
        }
    }

    public void getResults(){
        double result = performOperation();
        System.out.println(String.format("the result is: $%.2f",result));
        
    }
    public double getOperand1(){
        return (operandOne);
    }
    public void setOperand1(double x){
        this.operandOne = x;
    }
    public double getOperand2(){
        return (operandTwo);
    }
    public void setOperand2(double y){
        this.operandTwo = y;
    }
    public String getOperation(){
        return (operation);
    }
    public void setOperation(String operation){
        this.operation= operation;
    }
}