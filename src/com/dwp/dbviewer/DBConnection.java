/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwp.dbviewer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author OOGUNDIP
 */
public class DBConnection {
    private String db_host = "db_host";
    private String db_username = "db_username";
    private String db_password = "db_password"; 

    
        public Connection dBConnectivitiy() throws SQLException {
            
            try {
                if ("db_host".equals(db_host)) {
                    db_host = Support.getConfigData(db_host);
                    db_username = Support.getConfigData(db_username);
                    db_password = Support.getConfigData(db_password);
                } 
                
                //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Class.forName("com.mysql.jdbc.Driver");         
                Connection conn = DriverManager.getConnection(db_host, db_username, db_password);
                //conn.close();
                return conn;
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
}
