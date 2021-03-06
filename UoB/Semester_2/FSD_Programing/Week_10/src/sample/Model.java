package sample;

import java.sql.*;

public class Model {

    Connection connection;

    public Model() {
        connection = SQLConnection.getConnection();

        if (connection == null) {
            System.out.println("Connect Failed.");
            System.exit(1);
        }
    }

    public boolean isConnected() {
        try {
            return !connection.isClosed();

        } catch (SQLException ignored) {
            return false;
        }

    }

    public boolean isLogin(String user, String passwd) throws Exception {
        PreparedStatement stmt;
        ResultSet rs;
        try {
            stmt = connection.prepareStatement("select * from userpass where username = ? and password = ?");
            stmt.setString(1, user);
            stmt.setString(2, passwd);
            rs = stmt.executeQuery();

            return rs.next();

        } catch (Exception e) {
            return false;
        }
    }

}
