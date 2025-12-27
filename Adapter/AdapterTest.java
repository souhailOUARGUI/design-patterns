public class AdapterTest {
    public static void main(String[] args){
        UniteCentrale uc = new UniteCentrale();
        // uc.afficher("Hello World");
        uc.setVga(new Vp());
        uc.afficher("Hello World");
        uc.setVga(new Moniteur());
        uc.afficher("Hello World");

        // Adapter
        Hdmi tv = new TV();
        uc.setVga( new Adapter(tv) );  
        uc.afficher("Hello World");

    }
    
}
