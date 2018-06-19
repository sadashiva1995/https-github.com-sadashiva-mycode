package com.dev.factory;

import com.dev.dao.EmpInfoDAO;
import com.dev.dao.HibernateImpl;
import com.dev.dao.JDBCImpl;

public class UserInfoDAOFactory {

	private final static String DATABASE="Hibernate";
	
    private static final EmpInfoDAO ref=getDAO();
    
    private static EmpInfoDAO getDAO()
    {
    	EmpInfoDAO db=null;
    	
    	if(DATABASE.equals("jdbc"))
    	{
    		db=new JDBCImpl();
    		
    	}
    	else if(DATABASE.equals("Hibernate"))
    	{
    		db=new HibernateImpl();
    	}
    	return db;
    }
    public static EmpInfoDAO getDatabase()
    {
    	//return getDAO(); use to non singlton class
    	return ref;//singlton class
    }
	
}
