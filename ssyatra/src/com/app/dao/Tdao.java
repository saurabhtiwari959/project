package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Tours;
import com.app.pojos.TravelOwner;

@Transactional
@Repository
public class Tdao implements ITdao {
	@Autowired
	private SessionFactory sf;
	
	public void add(TravelOwner t) 
	{
		sf.getCurrentSession().persist(t);
	}
	
	public void add(Tours t) 
	{
		sf.getCurrentSession().persist(t);
	}

	@Override
	public void registration(TravelOwner t) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().persist(t);
	}

}
