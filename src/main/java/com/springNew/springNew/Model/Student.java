package com.springNew.springNew.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

/**
 * @author krishnakumar
 *
 */
@Entity
public class Student {
	@Id
	private Long student_id;
	@Column
	@NonNull
	private String s_name;
	@NonNull
	private int s_class;
	/**
	 * @param student_id
	 * @param s_name
	 * @param s_class
	 */
	public Student(Long student_id, String s_name, int s_class) {
		super();
		this.student_id = student_id;
		this.s_name = s_name;
		this.s_class = s_class;
	}
	public Student() {
		
	}
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_class() {
		return s_class;
	}
	public void setS_class(int s_class) {
		this.s_class = s_class;
	}
	
	

}
