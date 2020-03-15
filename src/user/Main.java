package user;

import book.BookList;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        BookList bookList = new BookList(); //创建数据
//        NormalUser user = login();
//        while (true){
//            int choice = user.menu();
//          user.doAction(choice, bookList);
//        }
//    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while (true){
          int choice=  user.menu();
          user.doAction(choice,bookList);
        }
    }
    public  static  User login(){
        System.out.println("请登陆系统");
        System.out.println("请输入您的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("请输入您的身份：1.管理员，2.普通");//向上转型
        int who = scanner.nextInt();
      if(who==1){
         return  new Admin(name);
      }
        return new  NormalUser(name);
    }
}
