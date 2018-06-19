package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;



public class User_MasterTest {

	public static void main(String[] args) {
		
		User_MasterTest user=new User_MasterTest();
		user.setUserId("1");
		user.setUserId("shiva");
		user.setUserId("1111");
		user.setUserId("admin");
		
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=factory.openSession();
		EmpInfoDAO emp=	UserInfoDAOFactory.getDatabase();
		
		emp.login(user.getUserId(),user.getUserId());
		
		session.save(user);
		
	
		session.beginTransaction().commit();
		
		
	}

	private String getUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setUserId(String string) {
		// TODO Auto-generated method stub
		
	}
}
