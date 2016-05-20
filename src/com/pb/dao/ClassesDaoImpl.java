package com.pb.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.pb.domain.Classes;

public class ClassesDaoImpl extends HibernateTemplate implements ClassesDao{

	@Override
	public void save(Classes classes) {
		// TODO Auto-generated method stub
		super.save(classes);
	}

	@Override
	public void update(Classes classes) {
		// TODO Auto-generated method stub
		super.update(classes);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public Classes findByid(Integer id) {
		// TODO Auto-generated method stub
		return (Classes) super.get(Classes.class, id);
	}
	
	@Override
	public List<Classes> classes() {
		// TODO Auto-generated method stub
		return super.find("from Classes");
	}

}
