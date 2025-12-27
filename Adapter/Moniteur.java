public class Moniteur implements Vga {
    @Override
    public void print(String msg) {
        System.out.println("Moniteur affiche: " + msg);
    }
    
}
