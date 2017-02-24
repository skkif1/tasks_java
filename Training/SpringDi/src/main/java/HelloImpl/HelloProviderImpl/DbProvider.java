package HelloImpl.HelloProviderImpl;


import HelloInterfaces.HelloProvider;

import javax.sql.DataSource;
import java.sql.*;

public class DbProvider implements HelloProvider {
    private String message;
    private DriverManager ds;


    public String provideHello() {


        try (Connection con = ds.getConnection("jdbc:mysql://localhost:3306/springdi", "root", "root");
             PreparedStatement preSt = con.prepareStatement("SELECT * FROM new_table WHERE id = 1")) {
            try (ResultSet rs = preSt.executeQuery()) {
                if (rs.next()) {
                    message = rs.getString("message");
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }


        return message;
    }
}
