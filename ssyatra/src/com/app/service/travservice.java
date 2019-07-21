package com.app.service;

import java.util.List;

import org.eclipse.jdt.internal.compiler.env.IModule.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.Itdao;
import com.app.pojos.Tours;
import com.app.pojos.TravelOwner;
@Service
public class travservice implements Itravservice {
	@Autowired
	private Itdao dao;

	@Override
	public void add(TravelOwner t) {
		// TODO Auto-generated method stub
		dao.add(t);
	}

	@Override
	public void add(Tours t) {
		// TODO Auto-generated method stub
		dao.add(t);
	}

	public List<Tours> gettour(String dep,String arr){
		return dao.gettour(dep, arr);
	}

	}


