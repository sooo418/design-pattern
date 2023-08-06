package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentDir = "/";

    @Override
    public void visit(File f) {

        System.out.println(currentDir + "/" + f);

    }

    @Override
    public void visit(Directory dir) {

        System.out.println(currentDir + "/" + dir);

        String saveDir = currentDir;
        currentDir = currentDir + "/" + dir.getName();
        Iterator<Entry> ir = dir.iterator();

        while (ir.hasNext()) {
            Entry entry = ir.next();
            entry.accept(this);
        }

        currentDir = saveDir;
    }
}
