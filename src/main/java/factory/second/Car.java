package factory.second;

// 직접 생성할 일이 없으므로 abstract 추상 클래스로 정의
public abstract class Car {
    String productName;

    public Car(String productName) {
        this.productName = productName;
    }

    public String toString() {
        return productName;
    }
}
