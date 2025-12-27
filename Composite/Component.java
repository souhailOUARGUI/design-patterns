public abstract class Component {
    private String name;
    protected int level;

    public Component(String 
    name) {
        this.name = name;
    }

    public abstract void print();
    public String getTab(){
        String tab = "";
        for (int i = 0; i< level; i++){
            tab += "\t";
        }
        return tab;
    }

    
}