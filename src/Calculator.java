public abstract class Calculator {
    protected double val1;
    protected String operator;
    protected double val2;

    public Calculator(double val1, String operator,  double val2) {
        this.operator = operator;
        this.val1 = val1;
        this.val2 = val2;
    }

    public String getOperator() {
        return operator;
    }
    public double getVal1() {
        return val1;
    }
    public double getVal2() {
        return val2;
    }

}
