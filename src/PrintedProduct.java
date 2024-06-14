public abstract class PrintedProduct {

    private String name;
    private int pageQuantity;
    private String content;

    public PrintedProduct(String name, int pageQuantity, String content) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public String getContent() {
        return content;
    }

    public void printContent(){
        System.out.println(content);
    }

}
