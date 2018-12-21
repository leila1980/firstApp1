package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author leila
 *
 */
@Entity
@Table(name = "EmployeeTable")
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String empno;
	private String idno;
	private String name;
	private String family;
	private String fathername;
	private String pass;
	
	
	public Employee(String empno, String idno, String name, String family, String fathername, String pass) {
		super();
		this.empno = empno;
		this.idno = idno;
		this.name = name;
		this.family = family;
		this.fathername = fathername;
		this.pass = pass;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empno=" + empno + ", idno=" + idno + ", name=" + name + ", family=" + family
				+ ", fathername=" + fathername + ", pass=" + pass + "]";
	}
	}
	
	

