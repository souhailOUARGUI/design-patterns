public class UniteCentrale {
    private Vga vga;

    // public UniteCentrale(Vga vga) {
    //     this.vga = vga;
    // }
    
    public void afficher(String msg){
        System.out.println("*********");
        vga.print(msg);
        System.out.println("*********");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }

}