public class File extends Component {
    private String name;

    public File(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(getTab() + "File: " + name);
    }

}
