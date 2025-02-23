package mediatheque;

public class CatalogPrinter implements ItemVisitor {
    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

    @Override
    public void visit(CD cd) {
        System.out.println(cd);
    }
}
