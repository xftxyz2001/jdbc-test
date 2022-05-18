package com.xftxyz.jdbctest5.view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.xftxyz.jdbctest5.dao.StudentDao;
import com.xftxyz.jdbctest5.dao.impl.StudentDaoImpl;
import com.xftxyz.jdbctest5.domain.Student;
import com.xftxyz.jdbctest5.util.JDBC;

/**
 * Hello world!
 *
 */
public class App {

    private Connection conn = null;
    private StudentDao studentDao = null;

    private void run() {
        try {
            conn = JDBC.getConnection();
        } catch (ClassNotFoundException | IOException | SQLException e) {
            System.err.println("获取链接失败");
            e.printStackTrace();
            return;
        }

        studentDao = new StudentDaoImpl();

        shell();

        try {
            JDBC.closeConnection(conn);
        } catch (SQLException e) {
            System.err.println("关闭链接失败");
            e.printStackTrace();
        }

    }

    private void shell() {
        while (true) {
            show();
            break;
        }
    }

    private void show() {
        List<Student> students = studentDao.getStudents(conn);
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        new App().run();
    }
}
