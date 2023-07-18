package decorator;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee ethiopiaAmericano = new EthiopiaAmericano();
        ethiopiaAmericano.brewing();

        System.out.println();

        Coffee ethiopiaLatte = new Latte(ethiopiaAmericano);
        ethiopiaLatte.brewing();

        System.out.println();

        Coffee ethiopiaMochaLatte = new Mocha(new Latte(ethiopiaAmericano));
        ethiopiaMochaLatte.brewing();

        System.out.println();

        Coffee kenyaMochaLatte = new Mocha(new Latte(new KenyaAmericano()));
        kenyaMochaLatte.brewing();

    }
}
