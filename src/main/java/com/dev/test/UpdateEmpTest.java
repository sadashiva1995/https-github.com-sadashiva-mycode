package com.dev.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dto.Employee;
import com.dev.factory.UserInfoDAOFactory;
import com.dev.utils.HibernateUtils;

public class UpdateEmpTest {
	public static void main(String[] args) {
	SessionFactory factory=HibernateUtils.getSessionFactory();
	Session session=  factory.openSession();
	EmpInfoDAO emp1=UserInfoDAOFactory.getDatabase();
	Employee emp=null;

	boolean b=emp1.updateEmp("Emp_ID");
	if(b==true){
		System.out.println("Update profile successfully");
	}else {
		System.out.println(" Update unsuccessfull");
	}

	session.save(emp);

	session.beginTransaction().commit();
}
}
