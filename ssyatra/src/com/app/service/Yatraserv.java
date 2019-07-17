package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITdao;
import com.app.pojos.TravelOwner;

@Service
public class Yatraserv implements IYatraserv {

	@Autowired
	private ITdao dao;
	@Override
	public void registration(TravelOwner t) {
		// TODO Auto-generated method stub
		dao.registration(t);
		
	}

	
}
