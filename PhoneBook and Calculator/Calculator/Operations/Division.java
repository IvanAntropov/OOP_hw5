package Calculator.Operations;

import Calculator.Operations.Base.Operate;

public class Division extends Operate {
    @Override
    public double operate(double a,double b) {
        double result = a / b;
        return result;
    }
}