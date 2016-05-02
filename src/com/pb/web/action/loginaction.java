package com.pb.web.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;
import com.pb.dao.StudentDao;

public class loginaction extends ActionSupport{
	String tage;
	String name;
	String password;
	
	public String getTage() {
		return tage;
	}

	public void setTage(String tage) {
		this.tage = tage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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
		System.out.println(name);
		System.out.println(password);
		
		if(name.equals(password)){
			if(name.equals("admin")){
				tage="admin";
				return SUCCESS;
			}else{
				tage="ordinary";
				return SUCCESS;
			}
		}else{
			return INPUT;
		}		
	}
	
}
