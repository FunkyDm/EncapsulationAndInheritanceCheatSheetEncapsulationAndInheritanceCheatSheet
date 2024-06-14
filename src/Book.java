import java.time.LocalDate;

public class Book extends PrintedProduct {

    private String authorName;
    private int publishYear;

    public Book(String name, int pageQuantity, String content, String authorName, int publishYear) {
        super(name, pageQuantity, content);
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int year){
        if (year < 1500 || year > LocalDate.now().getYear()) {
            System.out.println("Введите другой год. ");
            return;
        }
        this.publishYear = year;
    }

}
