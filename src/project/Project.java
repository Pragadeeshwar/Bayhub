
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author PRAGADEESHWAR
 */
public class Project {

    public static String uname;
    public static String uid;
    public static String pid;
    public static String upid;


    public static void insBid(String post) throws ClassNotFoundException, SQLException {
        Statement st;
        //JDBC
        Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bayhub","root","");
        st = con.createStatement();
        
        st.executeUpdate(post);
        
    }
    
    public static ResultSet sqlQuery(String query) throws ClassNotFoundException, SQLException{
        Statement st;
        //JDBC
        Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bayhub","root","");
        st = con.createStatement();
        
        return st.executeQuery(query);
    }
}
