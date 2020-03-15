package user;

import action.*;
import book.BookList;

import java.util.Scanner;

public class Admin extends User {
//    private  String name;
////    public  int menu(){
////        return 0;
////    }
////    public void doAction(int choice, BookList bookList){
////
////    }
//    private IAction[] actions = new IAction[]{
//
//};
    public Admin(String name) {
        super(name);
        actions = new IAction[]{
                new ExitAction(),
                new AddAction(),
                new DelAction(),
                new FindAction(),
                new DisPlayAction()
        };
    }

    @Override
    public int menu() {
        System.out.println("*****************");
        System.out.println(this.name+"欢迎使用图书馆管理系统，您是管理员");
        System.out.println("1.新增图书");
        System.out.println("2.删除图书");
        System.out.println("3.查找图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出");
        System.out.println("*****************");
//        System.out.println("请输入您的选择：");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        return choice;

    }

//    @Override
//    public void doAction(int choice, BookList bookList) {
//        super.doAction(choice, bookList);bookList

    }

