package com.xftxyz.jdbctest5.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
    // 获取链接
    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        // 1.加载配置文件
        InputStream is = JDBC.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);

        // 2.读取配置信息
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");
        // System.out.println(user + " " + password + " " + url + " " + driverClass);
        // 3.加载驱动
        Class.forName(driverClass);

        // 4.获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    // 关闭链接
    public static void closeConnection(Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}
