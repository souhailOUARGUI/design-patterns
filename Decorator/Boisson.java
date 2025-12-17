package Decorator;

public abstract class Boisson {
    private String description;
    public Boisson(String desc){
        this.description=desc;
    }
    public abstract double cout();

    public String getDescription(){
        return description;
    }

}
