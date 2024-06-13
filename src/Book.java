import java.time.LocalDate;

public class Book {

    private String name;
    private String authorName;
    private int publishYear;

    private int pageQuantity;
    private String content;

    public Book(String name, String authorName, int year) {
        this.authorName = authorName;
        this.name = name;
        this.publishYear = year;
    }

    public String getName() {
        return name;
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

    public void printContent() {
        System.out.println(content);
    }

}
