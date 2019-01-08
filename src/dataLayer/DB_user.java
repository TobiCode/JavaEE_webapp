package dataLayer;

import java.sql.*;

public class DB_user {

    //JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/webapptutorial?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    //Database Credentials
    static final String USER = "webapp_user";
    static final String PASS = "test12341234";

    public boolean isValidUserLogin(String sUsername, String sUserPassword) {

        boolean isValidUser = false;

        Connection conn = null;
        Statement stmt = null;
        String sql = "";

        try {
            //Step2: Register JDBC driver -> creates an instance of java.lang.Class corresponding to the given Name.
            //This forces the classloader to load this class, and execute any code in its static blocks.
            //Older JDBC drivers used to use these static block to register themselves to the java.sql.DriverManager so they can later be used to connect to the database.
            Class.forName("com.mysql.jdbc.Driver");

            //Step3: Open a connection
            System.out.println("Connecting to a database....");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);


            //Step4: Execute a Query
            System.out.println("Creating statement....");
            stmt = conn.createStatement();

            sql = "SELECT * FROM users WHERE user_name = \"" +
                    sUsername + "\" AND user_password = \"" + sUserPassword + "\"";

            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //Step5: Extract data from result set

            if (rs.next()) {
                isValidUser = true;
            }

            //Step6: Clean-up Environment
            rs.close();
            stmt.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Closing DB Connection - Goodbye");

        return isValidUser;
    }


}
