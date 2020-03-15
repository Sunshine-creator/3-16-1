package book;

import action.IAction;

public class BookList {
    private int size =0;
    private Book [] books = new Book[100];
    public BookList() {
        books[0] = new Book("西游记",79,"吴承恩",
                "四大名著",false);
        books[1] = new Book("三国演义",89,
                "罗贯中","四大名著",false);
        books[2] = new Book("红楼梦",89,
                "曹雪芹","四大名著",false);
        size =3;
    }
     public Book getBook(int pos){
        return books[pos];
     }
     public void setBook(int pos,Book book){
        books[pos] = book;
     }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
