package proxy;

public class Printer implements Printable {

    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer의 인스턴스(" + name + ")를 생성중");
    }

    @Override
    public void setPrinterName(String name) {
        System.out.println("real : getPrinterName()");
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        System.out.println("real : getPrinterName()");
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    public void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println(".");
        }
        System.out.println("완료");
    }
}
