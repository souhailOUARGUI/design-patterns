package Proxy;

public class Proxy implements  Standard{
    private Implementation target;
    @Override
    public void process() {
        boolean conditionSecuite = verifierSecurite();

        if (conditionSecuite){
            if(target == null){
                target = new Implementation();
            }

            target.process();

            System.out.println("Traitement terminé avec succès");

        }else{
            throw new RuntimeException("Accès interdit : security conditions non remplies.");
        }
    }

    private boolean verifierSecurite(){
        System.out.println("verification du contexte du securite... ");
        return true;
    }
}
