package com.sirion.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sirion.bean.Address;
import com.sirion.util.MyConnection;

public class AddressDao implements IAddressDao {
	private Connection con=MyConnection.getDbConnection();
	@Override
	public String addAddress(Address add) {
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into address values(?,?,?,?)");
			ps.setInt(1, add.getAid());
			ps.setString(2, add.getCity());
			ps.setString(3, add.getCountry());
			ps.setInt(4, add.getZip());
			
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Address Created!";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Address getAddress(int aid) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from address where aid=?");
			ps.setInt(1, aid);	
			ResultSet rs=ps.executeQuery();
			if(rs.next())
				return new Address(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getInt(4));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}