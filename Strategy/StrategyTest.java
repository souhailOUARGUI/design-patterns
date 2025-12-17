public class StrategyTest {
    public static void main(String[] args) {
        Employe emp1 = new Employe("CIN123", 5000, new CalculIGRMaroc());
        System.out.println("Salaire net mensuel (Maroc): " + emp1.getSalaireNetMensuel());
        emp1.setCalculIGR(new CalculIGRAlg());
        System.out.println("Salaire net mensuel (Algérie): " + emp1.getSalaireNetMensuel());

    }

}
