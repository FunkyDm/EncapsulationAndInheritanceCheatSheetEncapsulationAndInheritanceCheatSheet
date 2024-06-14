import java.io.PipedReader;

public class Main {
    public static void main(String[] args) {

        Book b = new Book("Crime and punishment", 1000, "base book content", "Fyodor Dostoyevskiy", 1868);
        Magazine m = new Magazine("Generic name", 500, "Generic magazine content");

        PrintedProduct[] products = new PrintedProduct[] {
                new Book("Generic book name 1", 300, "generic book content 1", "generic author book 1", 1377),
                new Magazine("name1", 100, "c1"),
                new Magazine("name2", 100, "c2"),
        };

        for (int i = 0; i < products.length; i++){
            PrintedProduct p = products[i];
//            p.getAuthorName();
            p.printContent();
        }

        m.printContent();
        b.printContent();

    }
}