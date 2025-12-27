public class CompositeTest {
    public static void main( String[] args) {
        Folder root = new Folder("Root");
        root.level = 0;
        root.add(new File("File1"));
        root.add(new File("File2"));

        System.out.println("---");
        root.print();
        System.out.println("---");

        Folder subF1 = (Folder) root.add(new Folder("subF1"));
        subF1.add(new File("File3"));
        subF1.add(new File("File4"));
        
        System.out.println("---");
        root.print();
        System.out.println("---");

    }
    
}
