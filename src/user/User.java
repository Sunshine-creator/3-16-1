package user;

import action.IAction;
import book.BookList;

 abstract class User {
     protected IAction[] actions = null;
     String name = null;

     public User(String name) {
         this.name = name;
     }

     abstract public int menu();
    public void doAction(int choice, BookList bookList){
        this.actions[choice].work(bookList);
    }
}
