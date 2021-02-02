package com.lwl.cj.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeService {

	private static final String SLECT_EMP = "select empno,ename,email from employee";

	public static void main(String[] args) {
		showEmployeeDetails();
	}

	private static void showEmployeeDetails() {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = ConnectionUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(SLECT_EMP);
			while (rs.next()) {
				System.out.println("--------------------------");
				System.out.println(rs.getInt("empno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getString("email"));

			}
		} catch (SQLException e) {
			System.out.println("While getting employee details: " + e);
		} finally {
			ConnectionUtil.close(rs, st, con);
		}
	}

}
