package com.dev.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.dev.dto.Employee;
import com.dev.dto.User_Master;
import com.dev.utils.HibernateUtils;


public class HibernateImpl implements EmpInfoDAO
{
	SessionFactory factory=HibernateUtils.getSessionFactory();
	Session session=null;
	
	@Override
	public Employee login(String UserId, String UserPassword) {
		Session session=factory.openSession();
		
		Employee emp=new Employee();
		User_Master us=new User_Master();

		session.getTransaction().begin();
		if(UserId.equals(us.getUserId())&&UserPassword.equals(us.getUserPassword()))
		{
			session.getTransaction().commit();
			return emp;
			
		}
		else{
		session.getTransaction().commit();
		//session.close();
		return emp;
		 }
	
	}
	
	@Override
	public Employee searchEmp(String Emp_ID) {

		Session session=factory.openSession();

		session.getTransaction().begin();
		Employee emp=session.get(Employee.class,Emp_ID);
		
		return emp;
	
	}
	@Override
	public boolean createEmpProfile(Employee emp) {
try {
			
			Session session=factory.openSession();

			session.getTransaction().begin();
			Date d=new Date();
			emp.setEmp_ID("5");
			emp.setEmp_First_Name("sada");
			emp.setEmp_Last_Name("nk");
			emp.setEmp_Date_of_Birth(d);
			emp.setEmp_Date_of_Joining(d);
			emp.setEmp_Basic(10000);
			emp.setEmp_Contact_Num("9901960894");
			emp.setEmp_Dept_ID(1);
			emp.setEmp_Designation("software engineer");
			emp.setEmp_Gender("m");
			emp.setEmp_Grade("A");
			emp.setEmp_Home_Address("banagalore");
			emp.setEmp_Marital_Status("s");
			

			session.save(emp);

			session.getTransaction().commit();
	   return true;
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	finally {
		if(session!=null)
		session.close();
	}
		//return false;

	}
	@Override
	public boolean updateEmp(String Emp_ID) {
		Session session=factory.openSession();

		session.getTransaction().begin();
		Employee emp=session.get(Employee.class,Emp_ID);
		emp.setEmp_First_Name("raam");
		emp.setEmp_ID(Emp_ID);
		emp.setEmp_Last_Name("raghu");
		 session.getTransaction().commit();
		// session.close();
		 
		 return true;
	}
	@Override
	public List<Employee> empDetails() {
		Session session=factory.openSession();

		session.getTransaction().begin();
		 String qry="select * from Employee emp";
			Query query=session.createQuery(qry);
			 
			List<Employee> emp=query.list();
			//System.out.println(obj);*/
		
		return emp;
	}


	}
