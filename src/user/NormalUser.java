package user;

import action.*;
import book.BookList;

import java.util.Scanner;

public class NormalUser extends User {
//    private  String name;
//    private IAction[] actions = new IAction[]{
//            new ExitAction(),
//            new FindAction(),
//            new BorrowAction(),
//            new ReturnAction(),
//    };

    public NormalUser(String name) {
        super(name);
         actions = new IAction[]{
                 new ExitAction(),
                 new FindAction(),
                 new BorrowAction(),
                 new ReturnAction(),
         };
    }
    public  int menu(){
        System.out.println("**************");
        System.out.println("欢迎"+this.name+"使用图书馆管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("0.退出");
        System.out.println("**************");
        System.out.println("请输入您的选择：");
        Scanner scanner =new Scanner(System.in);
        int choice =  scanner.nextInt();
        return choice;
    }
    public void doAction(int choice, BookList bookList){
        actions[choice].work(bookList);
    }
}
