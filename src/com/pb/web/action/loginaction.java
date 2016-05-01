package com.pb.web.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.dao.StudentDao;
import com.pb.domain.Student;

public class loginaction extends ActionSupport{
	/*Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}*/
	
	List list;
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String execute() throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao studentdao=(StudentDao) context.getBean("studentDao");
		list=studentdao.list();
		return SUCCESS;
	}
	
}
