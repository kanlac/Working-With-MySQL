package view;

import controller.DatabaseAccessor;
import model.Book;

public class BookTest {

    public static void main(String[] args) {

        /**
         * Uncomment to do operations...
         */

        // do insert
        if (insertBook()) {
            System.out.println("插入书籍成功！");
        } else {
            System.out.println("插入书籍失败！");
        }

        // do update
        if (updateBook()) {
            System.out.println("更新书籍成功！");
        } else {
            System.out.println("更新书籍失败！");
        }

        // do delete
        if (deleteBook()) {
            System.out.println("删除书籍成功！");
        } else {
            System.out.println("删除书籍失败！");
        }

    }

    /**
     * Customize books information...
     */

    public static Boolean insertBook() {

        Book book = new Book();

        book.setId(3);
        book.setName("昨日的世界");
        book.setPrice(98.56f);
        book.setBookCount(6);
        book.setAuthor("茨威格");

        DatabaseAccessor controller = new DatabaseAccessor();
        return controller.insert(book);
    }

    public static Boolean updateBook() {

        Book book = new Book();

        book.setId(8);
        book.setName("逃避自由");

        DatabaseAccessor controller = new DatabaseAccessor();
        return controller.update(book);
    }

    public static Boolean deleteBook() {

        Book book = new Book();

        book.setId(0);

        DatabaseAccessor controller = new DatabaseAccessor();
        return controller.deleteBook(book);
    }
}
