public class BasicCalculator extends Calculator implements Calculation{
    private String type = "BasicCalculator";

    public BasicCalculator(double val1, String operator, double val2) {
        super(val1, operator, val2);
    }

    @Override
    public void result() {
        double res = 0;
        if (this.operator.equals("+")){
            res = val1+val2;
        } else if(this.operator.equals("-")){
            res = val1-val2;
        }
        System.out.println(type + "calculated result: " + res);
    }
}
