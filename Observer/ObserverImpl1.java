package Observable;

public class ObserverImpl1 implements Observer {

    public void update(String msg) {
        System.out.println("ObserverImpl1 received message: " + msg);
    }
    
}
