package com.dev.dao;

/*import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.dev.beans.Employee;
import com.dev.beans.UserMaster;
import com.dev.utils.HibernateUtils;

public class HIBERNATEImpl implements EmpInfoDAO {
	SessionFactory factory = HibernateUtils.getSessionFactory();
	Session session=null;
<<<<<<< HEAD


	@Override
	public List<Employee> login(String user_id, String password)
	{ //boolean userFound=false;
		Session session=factory.openSession();
		UserMaster us=new UserMaster();
System.out.println(us);
=======
	
	@Override
	public Employee login(String UserId, String UserPassword) {
		Session session=factory.openSession();
		
		Employee emp=new Employee();
		User_Master us=new User_Master();
		
	
>>>>>>> branch 'master' of https://github.com/sadashiva1995/https-github.com-sadashiva-mycode
		session.getTransaction().begin();

	//	String query="  from UserMaster u where u.userId=:user_id and u.userPassword=:password";
		String query=" select * from UserMaster u where u.userId=? and u.userPassword=?";

		Query<UserMaster> q=session.createQuery(query);
		q.setParameter(0,user_id);
		q.setParameter(1,user_id);
	//	q.setParameter("user_id",user_id);

	//	q.setParameter("password", password);
		//List list = q.list();

		List<UserMaster> list=q.getResultList();

			session.getTransaction().commit();

			/*if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return list;         
		//Query query = session.createQuery(hql);
		//List<UserInfo> info=query.getResultList();
					//return  (UserInfo) info;
			//if(l.isEmpty()){
			//	return false;

		/*	}
			else
				return true;

	}

	@Override
	public Employee searchEmp(String emp_id)
	{
		Session session=factory.openSession();

		session.getTransaction().begin();
		Employee emp=session.get(Employee.class,emp_id);
		session.getTransaction().commit();
		return emp;
	}

	@Override
	public boolean createProfile(Employee emp) 
	{
try {

			Session session=factory.openSession();

			session.getTransaction().begin();
			/*emp.setEmp_First_Name("ds");
			emp.setEmp_id("1");
			emp.setEmp_Last_Name("dc");

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
	public void updateEmp(String emp_id)
	{
		Session session=factory.openSession();

		session.getTransaction().begin();
<<<<<<< HEAD
		Employee emp=session.get(Employee.class,emp_id);
		emp.setEmp_First_Name("raam");
		emp.setEmp_id(emp_id);
		emp.setEmp_Last_Name("raghu");
=======
		Employee emp=session.get(Employee.class,"5");
		//emp.setEmp_ID("5");
		emp.setEmp_First_Name("shiva");
		emp.setEmp_Last_Name("nk");
>>>>>>> branch 'master' of https://github.com/sadashiva1995/https-github.com-sadashiva-mycode
		 session.getTransaction().commit();
		 session.close();


	}

	@Override
	public List<Employee> empDetails()
	{
		Session session=factory.openSession();

		session.getTransaction().begin();
<<<<<<< HEAD
		 String qry="from Employee emp";
		Query<Employee> q= session.createQuery(qry);
		List<Employee> l=q.list();
		 session.getTransaction().commit();
			//System.out.println(obj);

		return l;
	}

}*/


import java.util.Date;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import org.hibernate.SessionFactory;



import com.dev.beans.Employee;
import com.dev.beans.User_Master;
import com.dev.utils.HibernateUtils;


public class HibernateImpl implements EmpInfoDAO

{

	SessionFactory factory=HibernateUtils.getSessionFactory();

	Session session=null;

	@Override
	public Employee login(String user_id, String password) {
		session=factory.openSession();
		System.out.println(user_id);
		session.getTransaction().begin();

		//  User_Master user=null;
		Employee emp=null;
		String query = "select emp from Employee emp,User_Master user where emp.emp_ID =user.userId and user.userId=:user_id and user.userPassword =:userPassword";

		//String query=" from Employee";
		Query q =session.createQuery(query);
		q.setParameter("user_id", user_id);
		q.setParameter("userPassword", password);

		emp = (Employee) q.uniqueResult();

		return emp;



	}


	

	@Override

	public List<Employee> empDetails() {

		Session session=factory.openSession();



		session.getTransaction().begin();

		String qry=" from Employee emp";

		Query query=session.createQuery(qry);



		List<Employee> emp=query.list();

		//System.out.println(obj);*/

		return emp;

	}

	@Override
	public Employee searchEmp(String emp_id)
	{
		Session session=factory.openSession();

		session.getTransaction().begin();
		Employee emp=session.get(Employee.class,emp_id);
		session.getTransaction().commit();
		return emp;
	}

//	@Override
//	public Employee searchEmp(String emp_id)
//	{
//		Session session=factory.openSession();
//
//		session.getTransaction().begin();
//		Employee emp=session.get(Employee.class,emp_id);
//		session.getTransaction().commit();
//
//		 String qry=" from Employee emp";
//			Query query=session.createQuery(qry);
//			 
//			List<Employee> emp=query.list();
//			//System.out.println(obj);*/
//		
//
//		return emp;
//	}



	@Override
	public boolean createEmpProfile(Employee emp) {
		
		try {

			session=factory.openSession();
			session.getTransaction().begin();			
			session.save(emp);
			System.out.println(emp);
			session.getTransaction().commit();
			
		} 

		catch (Exception e) {

			e.printStackTrace();

			return false;

		}

		finally {

			if(session!=null)

				session.close();

		}
		return true;

		
	}


	@Override
	public boolean updateEmp(Employee emp) {
		Session session=factory.openSession();



		session.getTransaction().begin();

		//Employee emp=session.get(Employee.class,"5");

		//emp.setEmp_ID("5");

		session.merge(emp);
		 session.getTransaction().commit();

		// session.close();

		 return true;
		
		
	}


}


