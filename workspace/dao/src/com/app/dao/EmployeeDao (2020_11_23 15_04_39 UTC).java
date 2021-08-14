package com.app.dao;

import com.app.bean.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.app.util.DBUtil;

public class EmployeeDAO {

    public Employee getById(int id) {
        Employee e = null;
        Connection con = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("Select * from emp where empid=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                e = new Employee(rs.getInt("empid"), rs.getString("name"), rs.getString("city"), rs.getDouble("salary"));
            }
            rs.close();
            pst.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        DBUtil.closeConnection(con);
        return e;
    }

    public List<Employee> getAll() {
        ArrayList<Employee> al = null;
        Connection con = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("Select * from emp");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                al = new ArrayList<Employee>();
                do {
                    Employee e = new Employee(rs.getInt("empid"), rs.getString("name"), rs.getString("city"), rs.getDouble("salary"));
                    al.add(e);
                } while (rs.next());
                //System.out.println("data Found");
            }
            rs.close();
            pst.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        DBUtil.closeConnection(con);
        return al;
    }

    public int add(Employee e) {
        int r = 0;
        Connection con = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("insert into emp(empid,name,city,salary) values(?,?,?,?)");
            pst.setInt(1, e.getEmpId());
            pst.setString(2, e.getName());
            pst.setString(3, e.getCity());
            pst.setDouble(4, e.getSalary());
            r = pst.executeUpdate();
            pst.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        DBUtil.closeConnection(con);
        return r;
    }

    public int delete(Employee e) {
        int r = 0;
        Connection con = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("delete from emp where empid=?");
            pst.setInt(1, e.getEmpId());
            r = pst.executeUpdate();
            pst.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        DBUtil.closeConnection(con);
        return r;
    }

    public int update(Employee e) {
        int r = 0;
        Connection con = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement pst = con.prepareStatement("update emp set name=?,city=?,salary=? where empid=?");
            pst.setString(1, e.getName());
            pst.setString(2, e.getCity());
            pst.setDouble(3, e.getSalary());
            pst.setInt(4, e.getEmpId());
            r = pst.executeUpdate();
            pst.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        DBUtil.closeConnection(con);
        return r;
    }
}
