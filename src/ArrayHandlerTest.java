import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;

import java.sql.SQLException;

/**
 * Get first line of table only.
 */
public class ArrayHandlerTest {

    public static void main(String[] args) {

        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "select * from employee";

        try {
            Object[] objs = qr.query(C3P0Utils.getConnection(), sql, new ArrayHandler());

            for (Object o: objs)
                System.out.println(o);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}