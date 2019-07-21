package com.app.dao;

import java.util.List;

import com.app.pojos.Tours;
import com.app.pojos.TravelOwner;

public interface Itdao {
	
	public void add(TravelOwner t) ;
	public void add(Tours t) ;
	public List<Tours> gettour(String dep,String arr);
}
