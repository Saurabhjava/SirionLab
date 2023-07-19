package com.sirion.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sirion.bean.Employee;
import com.sirion.util.MyConnection;

public class EmployeeDao implements IEmployeeDao {
	private Connection con=MyConnection.getDbConnection();
	@Override
	public String addEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setDate(4, Date.valueOf(emp.getDob()));
			ps.setInt(5, emp.getPhone());
			ps.setDouble(6, emp.getSalary());
			ps.setString(7, emp.getGender().toString());
			ps.setInt(8, emp.getAddress().getAid());
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Created...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
