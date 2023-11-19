package Visitor.VisitorProblem;

import java.util.Iterator;

public class FileFindVisitor extends Visitor {
    private String fileExtension;
    private String currentdir = "";

    public FileFindVisitor (String fileExtension) {
        this.fileExtension = fileExtension;
    }

    @Override
    public void visit(File file) {
        String fileName = file.getName();
        if (fileName.endsWith(fileExtension))
            System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
