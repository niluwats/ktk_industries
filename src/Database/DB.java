package Database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DB {

    private static String ip;
    private static String port;
    private static String dbName;
    private static String username;
    private static String password;

    static {
        exists();
        try {
            setUpConnection();
        } catch (Exception ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getIp() {
        return ip;
    }

    public static String getPort() {
        return port;
    }

    public static String getDbName() {
        return dbName;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setIp(String ip) {
        DB.ip = ip;
    }

    public static void setPort(String port) {
        DB.port = port;
    }

    public static void setDbName(String dbName) {
        DB.dbName = dbName;
    }

    public static void setUsername(String username) {
        DB.username = username;
    }

    public static void setPassword(String password) {
        DB.password = password;
    }
    private static Connection c;

    private static void setUpConnection() throws FileNotFoundException, IOException {
        System.out.println("innnnnnnn");
        Properties p = new Properties();
        FileReader fr = new FileReader("DB_data.config");
        p.load(fr);
        ip = p.getProperty("Server_Ip");
        port = p.getProperty("Port");
        dbName = p.getProperty("Database_Name");
        username = p.getProperty("User_Name"); 
        password = p.getProperty("Password");
        System.out.println(ip + port + username + password + dbName);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://" + ip + ":" + port + "/" + dbName 
                    + "?useUnicode=true&characterEncoding=UTF-8", "" + username + "", "" + password + "");
          //  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/central_industries","root","1234");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Base Connection Failed,, Try restartng your Machine and Mysql services",
                    "Failed to connect", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public static void iud(String sql) throws Exception {
        if (c == null) {
            try {
                setUpConnection();
            } catch (FileNotFoundException e) {
                System.out.println("Error");
                e.printStackTrace();
            }   
            
        }
        c.createStatement().executeUpdate(sql);
    }

    public static ResultSet search(String sql) throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeQuery(sql);
    }

    public static Connection getConnection() throws Exception {
        if (c == null) {
            setUpConnection();
        }
        return c;
    }

    public static Object getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void exists() {
        File f = new File("DB_data.config");
        try {
            if (f.exists()) {

            } else {
                JOptionPane.showMessageDialog(null, "DB_data.config file not found!.plz Contact Your System administator", "File not Found", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
//        System.out.println(ip);
//        System.out.println(port);
//        System.out.println(DB.dbName);
//        System.out.println(DB.password);
//        System.out.println(DB.username);

    }
}
