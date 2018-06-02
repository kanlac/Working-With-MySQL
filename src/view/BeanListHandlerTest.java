package view;

import c3p0.C3P0Utils;
import model.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Get only the first line of the table.
 */
public class BeanListHandlerTest {

    public static void main(String[] args) {

        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "select * from books";

        try {
            List<Book> list = (List<Book>) qr.query(C3P0Utils.getConnection(), sql, new BeanListHandler(Book.class));

            for(Book book:list){
                System.out.println(book.getId() + "--" + book.getName() + "--" + book.getPrice() + "--" + book.getBookCount() + "--" + book.getAuthor());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
