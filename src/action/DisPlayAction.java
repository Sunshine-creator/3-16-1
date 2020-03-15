package action;

import book.Book;
import book.BookList;

public class DisPlayAction implements  IAction {
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getSize(); i++) {
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
