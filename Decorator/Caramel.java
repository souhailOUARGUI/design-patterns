package Decorator;

public class Caramel extends Decorator {
    public Caramel(Boisson b){
        super(b,b.getDescription()+", Caramel");
    }
    public double cout(){
        return 0.50 + boisson.cout();
    }
    public String getDescription(){
        return boisson.getDescription()+", Caramel";
    }

}
