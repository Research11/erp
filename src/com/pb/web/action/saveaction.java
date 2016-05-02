package com.pb.web.action;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.dao.StudentDao;
import com.pb.domain.Student;

public class saveaction extends ActionSupport{
	
	Student stu;
	

	
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	


	List list;
	
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("nimei");
		System.out.println(stu.getName());
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentdao=(StudentDao) context.getBean("studentDao");
		Student student=studentdao.findBid(stu.getId());
		student.setName(stu.getName());
		student.setEmail(stu.getEmail());
		student.setBirthday(stu.getBirthday());
		studentdao.update(student);
		System.out.println(student.getName());
		list=studentdao.list();
		return SUCCESS;
	}
}
