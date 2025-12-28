package Template_Method;

public class TemplateImpl1 extends  TemplateClass{
    @Override
    protected int detail1(double data) {
        return (int) Math.sqrt(data);
    }

    @Override
    protected double detail2(double x1, double x2, int param) {
        double w = x1 / x2;
        return w * param;
    }
}
