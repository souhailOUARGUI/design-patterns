public class Adapter implements Vga {
    private Hdmi hdmiDevice;

    public Adapter(Hdmi hdmiDevice) {
        this.hdmiDevice = hdmiDevice;
    }

    @Override
    public void print(String msg) {
        hdmiDevice.view(msg);
    }
    
}
