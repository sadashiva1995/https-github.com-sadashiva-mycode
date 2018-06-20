package com.dev.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dto.Employee;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;

public class EmpDetailsTest {

	public static void main(String[] args) {
		SessionFactory factory=HibernateUtils.getSessionFactory();
		Session session=  factory.openSession();
		EmpInfoDAO emp1=UserInfoDAOFactory.getDatabase();
		Employee emp=new Employee();

		List<Employee> employee  =emp1.empDetails();
		for (Employee e : employee) {
			System.out.println(e.getEmp_First_Name());	
			System.out.println(e.getEmp_Last_Name());
			System.out.println(e.getEmp_Contact_Num());
		}
		

	//	session.save(emp);

		session.beginTransaction().commit();
	}
}
