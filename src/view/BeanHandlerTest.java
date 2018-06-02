package view;

import c3p0.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;

import java.sql.SQLException;

public class BeanHandlerTest {

    public static void main(String[] args) {

        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "SELECT * FROM books";

        try {
            Object[] objects = qr.query(C3P0Utils.getConnection(), sql, new ArrayHandler());
            for (Object obj: objects) {
                System.out.println(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
