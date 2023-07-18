package decorator;

// abstract 클래스는 아니지만 혼자서 기능을 제공하는 클래스가 아니고 다른 Decorator 들을 상속받기 위해서 구현했기 때문에 abstract 클래스로 정의한다.
public abstract class Decorator extends Coffee {

    Coffee coffee;

    public Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
