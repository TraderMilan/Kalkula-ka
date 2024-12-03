public class AdvancedCalculator extends Calculator implements Calculation {
    private String type = "AdvancedCalculator ";

    public AdvancedCalculator(String operator) {
        super(operator);
    }

    @Override
    public void result(double val1, double val2) {
        double res = 0;
        if (this.operator.equals("*")){
            res = val1*val2;
        } else if(this.operator.equals("/")){
            res = val1/val2;
        }
        System.out.println(type + "calculated result: " + res);
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
