package controller;

import c3p0.C3P0Utils;
import model.Book;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class AccessDB {

    public Boolean insert(Book book){

        int rows = 0;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "INSERT INTO books(id, name, price, bookCount, author) VALUES (?,?,?,?,?)";
        Object[] params = {book.getId(), book.getName(), book.getPrice(), book.getBookCount(), book.getAuthor()};

        try {
            rows = qr.update(C3P0Utils.getConnection(), sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rows > 0;
    }


    public Boolean update(Book book) {

        int rows = 0;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "UPDATE books SET name = ? WHERE id = ?";
        Object[] params={book.getName(),book.getId()};

        try {
            rows = qr.update(C3P0Utils.getConnection(), sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rows > 0;
    }


    public Boolean deleteBook(Book book) {

        int rows = 0;
        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "DELETE FROM books WHERE id = ?";
        Object[] params = { book.getId() };

        try {
            rows = qr.update(C3P0Utils.getConnection(), sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rows > 0;
    }
}
