package observer;

public class OddNumberGenerator extends NumberGenerator {

    int oddNumber = 1;

    @Override
    public int getNumber() {
        return oddNumber;
    }

    @Override
    public void execute() {

        for (int i = 1; i < 50; i+=2) {
            oddNumber = i;
            notifyObserver();
        }
    }
}
