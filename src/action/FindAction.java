package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行查找操作");
        System.out.println("请输入您要查找的书籍名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book =bookList.getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
            }
        }
    }
}
