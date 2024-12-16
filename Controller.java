package com.dao;

import java.util.Scanner;

import com.dto.Employee;

public class Controller {
	static int i;
	private Employee emp_obj[]=new Employee[10];
	
	public Employee save(Employee e) {
		Employee emp=new Employee(e.getId(),e.getName(),e.getMobno(),e.getSal());
		emp_obj[i++]=emp;
		return emp;
	}
	public Employee update(int id) {
		Scanner sc=new Scanner(System.in);
		Employee obj=null;
		for(Employee emp:emp_obj) {
			if(emp!=null && emp.getId()==id) {
				System.out.println("1.Update Name:/n2.Update Mob_No:/n3.Update Sal:/nEnter the option to update");
				int op=sc.nextInt();
				switch(op) {
				case 1:{
					System.out.println("Enter the Name:");
					String name=sc.next();
					emp.setName(name);
					System.out.println("Updated Name Successfully");
					break;
				}
				case 2:{
					System.out.println("Enter the Mob_No:");
					Long Mob_No=sc.nextLong();
					emp.setMobno(Mob_No);
					System.out.println("Updated Mob_No Successfully");
					break;
				}
				case 3:{
					System.out.println("Enter the Salary:");
					Double sal=sc.nextDouble();
					emp.setSal(sal);
					System.out.println("Updated Salary Successfully");
					break;
				}
				default:{
					System.out.println("Invalid option");
				}
				break;
				}
			}
		}
		return obj;
	}
	public Employee GetDataById(int id) {
		Employee obj=null;
		for(Employee emp:emp_obj) {
			if(emp!=null && emp.getId()==id) {
				System.out.println("----------------");
				System.out.println("Employee Id:"+emp.getId()+"<---/n--->"+"Employee Name:"+emp.getName()+"<---/n--->"+"Employee Mobile_No:"+emp.getMobno()+"<---/n--->"+"Employee Salary:"+emp.getSal());
				System.out.println("----------------");
				break;
			}
		}
		return obj;
	}
	public void DisplayAllData() {
		for(Employee emp:emp_obj) {
			if(emp!=null) {
				System.out.println("------------");
				System.out.println("Employee_Id:\"+emp.getId()+\"/n"+"Employee_Name:"+emp.getName()+"/n"+"Employee_Mobile_No:"+emp.getMobno()+"/n"+"Employee_Salary:"+emp.getSal());
				System.out.println("-----------------");
			}
		}
	}
}
