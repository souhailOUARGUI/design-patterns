package Decorator;

public class Chocolat extends Decorator{
    public Chocolat(Boisson b){
        super(b,b.getDescription()+", Chocolat");

    }
    public double cout(){
        return 0.99 + boisson.cout();
    }
    public String getDescription(){
        return boisson.getDescription()+", Chocolat";
    }

}
