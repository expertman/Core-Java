package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo1 {
	private DBConnection dbconn;
	private Connection conn;
	public JDBCDemo1() {
		this.dbconn = new DBConnection();
		this.conn = this.dbconn.getConnection();
	}
	public static void main(String[] args) {
		JDBCDemo1  demo = new JDBCDemo1();    //1,2,3
		Scanner scan = new Scanner(System.in);
		System.out.print("What's name ? : ");
		String name = scan.next().toUpperCase();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = demo.conn.createStatement();   //4
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT ename, sal, grade      ");
			sb.append("FROM emp, salgrade      ");
			sb.append("WHERE (sal BETWEEN losal AND hisal) AND ename = '" + name + "'  ");
			rs = stmt.executeQuery(sb.toString());     //5
			while(rs.next()) {  //6
				System.out.printf("%s\t%.1f\t%d%n", 
						           rs.getString("ename"), rs.getDouble("sal"), rs.getInt("grade"));
			}
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {   //7
			DBClose.dbClose(demo.conn, stmt, rs);
		}
	}
}
