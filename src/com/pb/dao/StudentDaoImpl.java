package com.pb.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.pb.domain.Student;

public class StudentDaoImpl extends HibernateTemplate implements StudentDao{
	

	@Override
	public void svae(Student student) {
		// TODO Auto-generated method stub
		this.save(student);		
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
		this.delete(student);
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		this.update(student);
	}

	@Override
	public Student findBid(Integer id) {
		// TODO Auto-generated method stub
		
		return (Student) get(Student.class, id);
		 
	}

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		//this.find("from Student");
		return this.loadAll(Student.class);
	}

}
