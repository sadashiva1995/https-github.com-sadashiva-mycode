package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dto.Employee;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;

public class CreateProfileTest {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=  factory.openSession();
		EmpInfoDAO emp1=UserInfoDAOFactory.getDatabase();
		Employee emp=null;

	boolean b =emp1.createEmpProfile(emp);
	if(b==true) {
		System.out.println("create profile successfully");
	}else {
		System.out.println("unsuccessfully creation profile");
	}
		

	//	session.save(emp);

		session.beginTransaction().commit();
		
	}
}