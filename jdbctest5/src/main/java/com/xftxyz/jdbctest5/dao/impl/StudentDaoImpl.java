package com.xftxyz.jdbctest5.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.xftxyz.jdbctest5.dao.BaseDao;
import com.xftxyz.jdbctest5.dao.StudentDao;
import com.xftxyz.jdbctest5.domain.Student;

public class StudentDaoImpl extends BaseDao<Student> implements StudentDao {

    @Override
    public List<Student> getStudents(Connection conn) {
        return getBeanList(conn, "select * from student");
    }

    @Override
    public void saveStudent(Connection conn, Student Student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteStudentById(Connection conn, String StudentSno) {
        // TODO Auto-generated method stub

    }

    @Override
    public Student getStudentById(Connection conn, String StudentSno) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateStudent(Connection conn, Student Student) {
        // TODO Auto-generated method stub

    }

}
