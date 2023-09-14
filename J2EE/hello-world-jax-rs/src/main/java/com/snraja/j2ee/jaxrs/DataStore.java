package com.snraja.j2ee.jaxrs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DataStore {
	Connection conn = null;
	public DataStore() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cities-db?autoReconnect=true&useSSL=false", "root", "admin");
		} catch (SQLException e) {
			System.out.println("SQLException occured: " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException occured: " + e);
		} catch(Exception e) {
			System.out.println("General exception occured:" + e);
		}
	}
	
	public List<AreaModel> getAreaData() {
		PreparedStatement p = null;
		ResultSet rs = null;
		List<AreaModel> list = new ArrayList<AreaModel>();
		try {
			String sql = "select * from areadata";
			p = conn.prepareStatement(sql);
			rs = p.executeQuery();
			while(rs.next()) {
				//int id = rs.getInt("id");
				String name = rs.getString("name");
				String area = rs.getString("area");
				AreaModel am = new AreaModel(name, area);
				list.add(am);
			}
		} catch (Exception e) {
			System.out.println("Exception occured: " + e);
		}
		return list;
	}
}
