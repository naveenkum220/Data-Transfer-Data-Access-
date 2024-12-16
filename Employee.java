package com.dto;

public class Employee {
	private int id;
	private String name;
	private Long mobno;
	private double sal;
	public Employee(int id, String name, Long mobno, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobno() {
		return mobno;
	}
	public void setMobno(Long mobno) {
		this.mobno = mobno;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	
}
