package Template_Method;

public abstract class TemplateClass {
    public double computeTemplate(double x, double y) {
        double data = x * y;
        double somme = 0;

        int param = detail1(data);

        // Boucle utilisant le résultat de l'étape abstraite
        for (int i = 0; i < param; i++) {
            // Appel d'une autre étape abstraite (Détail 2)
            double value = detail2(x, y, param);
            somme += value;
        }

        return somme;
    }

    protected abstract int detail1(double data);
    protected abstract double detail2(double x1,double x2, int param);
}
