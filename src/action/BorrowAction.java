package action;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowAction implements IAction {
    @Override
    public void work(BookList bookList) {
        System.out.println("执行借书操作");
        System.out.println("请输入要借阅书籍的名称：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i <bookList.getSize() ; i++) {
            Book book =bookList.getBook(i);
            if(book.getName().equals(name)){
                if(book.isBorrowed()){
                    continue;
                }else{
                    book.setBorrowed(true);
                    System.out.println("借书成功");
                    return;
                }
            }
        }
        System.out.println("没有匹配的书籍");
    }
}
