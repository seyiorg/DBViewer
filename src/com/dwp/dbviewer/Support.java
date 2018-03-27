/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dwp.dbviewer;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * @author OOGUNDIP
 */
public class Support {
    private static Properties prop = new Properties();

    private static Properties readConfigFile() throws IOException {
        FileInputStream fis = new FileInputStream("Config.properties");
        prop.load(fis);
        return prop;
    }

    static String getConfigData(String data) throws IOException {
        prop = readConfigFile();
        data = prop.getProperty(data);
        return data;
    }
}
