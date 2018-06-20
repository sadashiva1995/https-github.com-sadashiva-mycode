package com.dev.test;
import com.dev.dto.User_Master;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dto.Employee;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;



public class User_MasterTest {

	public static void main(String[] args) {
		
		User_Master user=new User_Master();
		/*user.setUserId("1");
		user.setUserName("aaa");
		user.setUserPassword("1111");
		user.setUserType("Employee");*/
	/*	SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		EmpInfoDAO emp=	UserInfoDAOFactory.getDatabase();
		
		emp.login(user.getUserId(),user.getUserId());
		
		session.save(user);*/
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=  factory.openSession();
		EmpInfoDAO emp1=UserInfoDAOFactory.getDatabase();
		Employee emp=new Employee();

		String id=user.getUserId();
		String psw=user.getUserPassword();
		emp =emp1.login(id,psw);
		if(emp!=null) {
			System.out.println("Login success" );	
		}
		else {
			System.out.println("Login failed" );	
		}
		
	
		session.beginTransaction().commit();
		
		
	}

	
}
	

	