public class TV implements Hdmi {
    @Override
    public void view(String msg) {
        System.out.println("TV affiche: " + msg);
    }
    
}
