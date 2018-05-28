import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.SQLException;
import java.util.List;

public class ArrayListHandlerTest {

    public static void main(String[] args) {

        QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());

        String sql = "select * from employee";

        try {
            // calling query & get result as a list.
            // replace ArrayListHandler() with BeanListHandler() when work with Bean objects.
            List<Object[]> list = qr.query(C3P0Utils.getConnection(), sql, new ArrayListHandler());

            for (Object[] objs: list)
                for (Object o: objs)
                    System.out.println(o);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}