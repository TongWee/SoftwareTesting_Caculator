import java.math.BigDecimal;
import java.text.Format;
public class Caculator {
private BigDecimal num1;
private BigDecimal num2;
private String result;

public void setNum1(double num1) {
	this.num1 = new BigDecimal(num1);
}

public void setNum2(double num2) {
	this.num2 = new BigDecimal(num2);
}
private double _format(){
	BigDecimal _num1 = new BigDecimal(result);
	BigDecimal _num2 = new BigDecimal(1);
	return _num1.divide(_num2, 5,BigDecimal.ROUND_HALF_UP).doubleValue();	
}
public String getResult() {
	if(!result.equals("ERROR"))
	{
		double _res = _format();
		if(_res>=Double.MAX_VALUE||_res<=-Double.MAX_VALUE)
			result = "ERROR";
		else
			result = Double.toString(_format());		
	}		
	return result;
}
public void Add() {
	BigDecimal _result;
	_result = num1.add(num2);
	result = _result.toString();	
}
public void Sub() {
	BigDecimal _result;
	_result = num1.subtract(num2);
	result = _result.toString();	
}
public void Mul() {
	BigDecimal _result;
	_result = num1.multiply(num2);
	result = _result.toString();	
}
public void Div() {
	BigDecimal _result;
	if(num2.doubleValue()!=0){
		_result = num1.divide(num2);
		result = _result.toString();
	}
	else 
		result = "ERROR";
	}
	}
