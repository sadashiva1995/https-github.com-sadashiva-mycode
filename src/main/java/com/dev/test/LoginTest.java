package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dto.Employee;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;

public class LoginTest {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=  factory.openSession();
		EmpInfoDAO emp1=UserInfoDAOFactory.getDatabase();
		Employee emp=new Employee();

		emp =emp1.login("1", "1111");
		if(emp!=null) {
			System.out.println("Login success" );	
		}
		else {
			System.out.println("Login failed" );	
		}
		
		

		//session.save(emp);
		session.beginTransaction().commit();
	
	}		
	
}
