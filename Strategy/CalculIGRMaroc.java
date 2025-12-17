public class CalculIGRMaroc implements CalculIGR {
    
    @Override
    public float calculerIGR(float salaireBrutMensuel){
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        float taux;
        if (salaireBrutAnuel <= 40000) {
            taux = 5;
        } else if (salaireBrutAnuel < 120000) {
            taux = 20;
        } else {
            taux = 42;
        }
        return salaireBrutAnuel * taux / 100;
    }
}
