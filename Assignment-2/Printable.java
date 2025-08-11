public interface Printable {
    public abstract void print();
}
class Document implements Printable {
    private String content;
    Document(String content) {
        this.content = content;
    }
    @Override
    public void print() {
        System.out.println("Printing Document: " + content);
    }
}
class Image implements Printable {
    private String fileName;

    Image(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void print() {
        System.out.println("Printing Image: " + fileName);
    }
}
class Invoice implements Printable {
    private String invoiceDetails;

    public Invoice(String invoiceDetails) {
        this.invoiceDetails = invoiceDetails;
    }
    @Override
    public void print() {
        System.out.println("Printing Invoice: " + invoiceDetails);
    }
}
class Main {
    public static void main(String[] args) {
        Printable doc = new Document("Java Interface Tutorial");
        Printable img = new Image("sunset.jpg");
        Printable inv = new Invoice("Invoice #12345");
        doc.print();
        img.print();
        inv.print();
    }
}