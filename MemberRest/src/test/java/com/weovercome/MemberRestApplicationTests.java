package com.weovercome;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRestApplicationTests {

	@Autowired
	private DataSource datasource;
	
	@Autowired
	private SqlSessionFactory factory;
	
	@Autowired
	private SqlSessionTemplate template;
	
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testConnection () throws SQLException{
		
		System.out.println(datasource);
		Connection conn = datasource.getConnection();
		
		System.out.println(conn);
		
		conn.close();
		
	}
	
	@Test
	public void testTemplate() {
		
		System.out.println("check template : " + template);
	}
	
	@Test
	public void testFactory () {
		
		System.out.println("check Factory : " + factory);
	}
	
}
