package cal;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
//	create default constructor
	public Calculator() {}

//	create needed variables
	private String operation;
	private double result;
	private double tempD1;
	private double tempD2;
	private double tempRes;
	
	private List<Object> operationList = new ArrayList<>();

	

	//	create setters and getters
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getOperation() {
		return operation;
	}
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	


//	create perform operation method
	public void performOperation(double dubNum) {
		
		if (operationList.size() >= 2 && operationList.get(operationList.size()-1).equals("*")) {
			tempD2 = dubNum;
			tempRes = tempD1 * tempD2;
			operationList.remove(operationList.size()-1);
			operationList.remove(operationList.size()-1);
			operationList.add(tempRes);
		}
		else if (operationList.size() >= 2 && operationList.get(operationList.size()-1).equals("/")) {
			tempD2 = dubNum;
			tempRes = tempD1 / tempD2;
			operationList.remove(operationList.size()-1);
			operationList.remove(operationList.size()-1);
			operationList.add(tempRes);
		}
		else {
			operationList.add(dubNum);
		}
	}
	
	public void performOperation(String op) {
		if (op.equals("+") || op.equals("-")) {
			operationList.add(op);
		}
		else if (op.equals("*")) {
			tempD1 = (double) operationList.get(operationList.size()-1);
			operationList.add(op);
		}
		else if (op.equals("/")) {
			tempD1 = (double) operationList.get(operationList.size()-1);
			operationList.add(op);
		}
		else if (op.equals("=")) {
			double operandOne;
			for (int i = 0; i < operationList.size(); i++) {
				operandOne = (double) operationList.get(0);
				if(operationList.get(i).equals("+")) {
					operandOne += (double) operationList.get(i+1);
					operationList.set(0, operandOne);
				}
				if(operationList.get(i).equals("-")) {
					operandOne -= (double) operationList.get(i+1);
					operationList.set(0, operandOne);
				}
				result = operandOne;
			}
		}
		else {
			System.out.println("Please input number or operator properly");
		}
	}
	
}
