package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Tours;
import com.app.pojos.TravelOwner;

@Transactional
@Repository
public class Tdao implements Itdao {
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

	public List<Tours> gettour(String dep, String arr) {
		// TODO Auto-generated method stub
		String jpql="select t from Tours t where t.source:=so and t.destination:=de";
		return sf.getCurrentSession().createQuery(jpql, Tours.class).setParameter("em", dep).setParameter("de", arr).getResultList();
	}

}
