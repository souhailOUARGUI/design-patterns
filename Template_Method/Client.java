package Template_Method;

public class Client {
    public static void main(String[] args) {
        TemplateClass t1 = new TemplateImpl1();
        System.out.println(t1.computeTemplate(6, 90));

        TemplateClass t2 = new TemplateImpl2();
        System.out.println(t2.computeTemplate(6,90));


    }
}
