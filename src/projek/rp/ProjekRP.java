package projek.rp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ProjekRP {

    public static Connection con;
    public static Statement stm;
    public static ResultSet rs;
    public static final String url = "jdbc:mysql://localhost/projekrp";
    public static final String user = "root";
    public static final String pass = "";
    public static Form1 form1;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, pass);
            
            form1 = new Form1();
            form1.pack();
            form1.setResizable(false);
            form1.setLocationRelativeTo(null);
            form1.setVisible(true);
        } catch (Exception e) {
            DialogUI dialogUI = new DialogUI(e.getMessage());
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }

    }

}
