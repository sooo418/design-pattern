package template.after;

public abstract class Car {

    // 하위 클래스에서 재정의하지 말아야 하기 때문에 final 사용
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public abstract void drive();

    public abstract void stop();

    // 구현하고 싶지 않을 경우 아래와 같이 사용 - hook method 라고 한다.
    public void washCar() {}
}
