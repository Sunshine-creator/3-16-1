package book;

public class Book {
    private  String name;
    private  int price;
    private String author;
    private  String Type;
    private boolean isBorrowed;

    public Book(String name, int price, String author, String type, boolean isBorrowed) {
        this.name = name;
        this.price = price;
        this.author = author;
        Type = type;
        this.isBorrowed = isBorrowed;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", Type='" + Type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
