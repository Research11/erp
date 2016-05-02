package com.pb.dao;

import java.util.List;

import com.pb.domain.Classes;

public interface ClassesDao {
	void save(Classes classes);
	void update(Classes classes);
	void delete(Integer id);
	Classes findByid(Integer id);
	List<Classes> classes();
}
