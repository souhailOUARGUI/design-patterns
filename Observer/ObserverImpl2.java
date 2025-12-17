package Observable;

public class ObserverImpl2 implements Observer {

    public void update(String msg) {
        System.out.println("ObserverImpl2 received message: " + msg);
    }
}
