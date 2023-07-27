package observer;

public class ObserverTest {

    public static void main(String[] args) {

        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        numberGenerator.addObserver(digitObserver);
        numberGenerator.addObserver(graphObserver);
        numberGenerator.execute();

        System.out.println("===========================");

        NumberGenerator oddNumberGenerator = new OddNumberGenerator();
        oddNumberGenerator.addObserver(digitObserver);
        oddNumberGenerator.addObserver(graphObserver);
        oddNumberGenerator.execute();

    }
}
