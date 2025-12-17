public class CalculIGRAlg implements CalculIGR {

    @Override
    public float calculerIGR(float salaireBrutMensuel){
        float salaireBrutAnuel = salaireBrutMensuel * 12;
        float taux = 35;
        return salaireBrutAnuel * taux / 100;
    }
}
