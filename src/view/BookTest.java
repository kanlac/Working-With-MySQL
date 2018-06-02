package view;

import controller.AccessDB;
import model.Book;

public class BookTest {

    public static void main(String[] args) {

        // insert
        if (insertBook()) {
            System.out.println("插入书籍成功！");
        } else {
            System.out.println("插入书籍失败！");
        }

        // update
        if (updateBook()) {
            System.out.println("更新书籍成功！");
        } else {
            System.out.println("更新书籍失败！");
        }

        // delete
        if (deleteBook()) {
            System.out.println("删除书籍成功！");
        } else {
            System.out.println("删除书籍失败！");
        }

    }

    public static Boolean insertBook(){
        Book book=new Book();
        book.setId(3);
        book.setName("韩非子");
        book.setPrice(98.56f);
        book.setBookCount(6);
        book.setAuthor("大中华区人");
        AccessDB dao=new AccessDB();
        return dao.insert(book);
    }

    public static Boolean updateBook(){
        Book book=new Book();
        book.setId(8);
        book.setName("山海经");
        AccessDB dao=new AccessDB();
        return dao.update(book);
    }

    public static Boolean deleteBook(){
        Book book=new Book();
        book.setId(0);
        AccessDB dao=new AccessDB();
        return dao.deleteBook(book);
    }
}
