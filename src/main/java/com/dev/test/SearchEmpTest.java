package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dto.Employee;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;

public class SearchEmpTest {
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=  factory.openSession();
		EmpInfoDAO emp1=UserInfoDAOFactory.getDatabase();
		Employee emp=new Employee();

		emp =emp1.searchEmp("1");
		System.out.println(emp.getEmp_Contact_Num());	
		System.out.println(emp.getEmp_Designation());

	//	session.save(emp);

		session.beginTransaction().commit();

	}	

}

