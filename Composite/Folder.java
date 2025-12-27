import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private String name;
    List<Component> children = new ArrayList<>();

    public Folder(String name){
        super(name);
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(getTab() + "Folder: "+ name);
        for(Component c : children){
            c.print();
        }
    }

    public Component add(Component c){
        this.children.add(c);
        c.level = this.level + 1; 
        return c;
    }
     
}
