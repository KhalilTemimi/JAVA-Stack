import java.util.ArrayList;

public class Calculator {

    private double operandOne = 0;
    private double operandTwo = 0;
    private String operation = "";
    private double result = 0;
    private ArrayList<Object> list = new ArrayList<Object>();

    public void performOperation(Object x){
        while (x != "=") {
            list.add(x);
        }
            if (operation == "+"){
                this.result= (operandOne+operandTwo);
            }else if(operation == "-"){
                this.result= (operandOne-operandTwo);
            }else{
                System.out.println("Wrong operation default result 0.0");
                this.result= (0.0);
            }
        }
    }

    public void getResults(){
        System.out.println("the result is: "+result);
        
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
    public double getResult(){
        return (result);
    }
    public void setResult(double result){
        this.result = result;
    }
}