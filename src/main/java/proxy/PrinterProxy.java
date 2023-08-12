package proxy;

public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrinterName(String name) {   // 이름의 설정
        if (real != null) {
            real.setPrinterName(name);  // "본인"에게도 설정한다.
        }
        System.out.println("proxy : setPrinterName()");
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        System.out.println("proxy : getPrinterName()");
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {   // "본인"을 생성
        if (real == null) {
            real = new Printer(name);
        }
    }
}
