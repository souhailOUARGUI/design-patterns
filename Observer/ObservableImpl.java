package Observable;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String msg){
        for(Observer o : observers){
            o.update(msg);
        } 
    }

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyObservers("State changed to: "+state);
    }

}
