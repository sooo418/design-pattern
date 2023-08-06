package visitor;

public abstract class Visitor {

    public abstract void visit(File f);
    public abstract void visit(Directory dir);
}
