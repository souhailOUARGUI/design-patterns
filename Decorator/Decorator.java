package Decorator;

public abstract class Decorator extends Boisson {
    protected Boisson boisson;
    public Decorator(Boisson b, String desc){
        super(desc);
        this.boisson=b;
    }
    public abstract String getDescription();
    

}
