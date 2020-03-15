package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        System.out.println("请输入要增加的书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入作者");
        String author = scanner.next();
        System.out.println("请输入价格");
        int price = scanner.nextInt();
        System.out.println("请输入书的类型");
        String type = scanner.next();
//        System.out.println();
//        System.out.println();
        Book book = new Book(name,price,author,type,false);
        int size = bookList.getSize();
        bookList.setBook(size,book);
//        bookList.setBook(size+1);
          bookList.setSize(size+1);
        System.out.println("新增图书成功");
    }
}
