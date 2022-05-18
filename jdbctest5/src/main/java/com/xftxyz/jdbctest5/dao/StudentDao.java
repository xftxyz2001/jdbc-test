package com.xftxyz.jdbctest5.dao;

import java.sql.Connection;
import java.util.List;

import com.xftxyz.jdbctest5.domain.Student;

public interface StudentDao {

    /**
     * 从数据库中查询出所有的记录
     */
    List<Student> getStudents(Connection conn);

    /**
     * 向数据库中插入一条记录
     */
    void saveStudent(Connection conn, Student Student);

    /**
     * 从数据库中根据学号删除一条记录
     */
    void deleteStudentById(Connection conn, String StudentSno);

    /**
     * 根据学号从数据库中查询出一条记录
     */
    Student getStudentById(Connection conn, String StudentSno);

    /**
     * 根据学号从数据库中更新一条记录
     */
    void updateStudent(Connection conn, Student Student);

    /**
     * 获取带分页的图书信息
     * 
     * @param page：是只包含了用户输入的pageNo属性的page对象
     * @return 返回的Page对象是包含了所有属性的Page对象
     */
    // Page<Student> getPageStudents(Connection conn, Page<Student> page);

    /**
     * 获取带分页和价格范围的图书信息
     * 
     * @param page：是只包含了用户输入的pageNo属性的page对象
     * @return 返回的Page对象是包含了所有属性的Page对象
     */
    // Page<Student> getPageStudentsByPrice(Connection conn, Page<Student> page,
    // double minPrice, double maxPrice);
}
