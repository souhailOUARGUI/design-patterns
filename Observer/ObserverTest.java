package Observable;

public class ObserverTest {
    public static void main(String[] args) {
       //creer observable
       ObservableImpl observableImpl = new ObservableImpl();
        //creer observer1
         ObserverImpl1 o1 = new ObserverImpl1();
        //creer observer2
            ObserverImpl2 o2 = new ObserverImpl2();

         //state change
         System.out.println("**********State change************ ");
            observableImpl.setState(0);
            //add observer1
            observableImpl.addObserver(o1);
            System.out.println("**********State change************ ");
            observableImpl.setState(1);
            //add observer2
            observableImpl.addObserver(o2);
            System.out.println("**********State change************ ");
            observableImpl.setState(2);

    }
}
