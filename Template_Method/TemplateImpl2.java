package Template_Method;

public class TemplateImpl2 extends TemplateClass{
    @Override
    protected int detail1(double input) {
        return (int) (input * input);
    }

    @Override
    protected double detail2(double x1, double x2, int param) {
        double w = Math.atan(x1 / x2);
        return w + param;
    }
}
