package com.view;

import java.util.Scanner;
import com.dto.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		com.dao.Controller c=new com.dao.Controller();
		while(true) {
			System.out.println("1.Save/n2.Update/n3.GetDataById/n4.Display All Data/n5.Exit/nEnter option:");
			int op=s.nextInt();
			switch(op) {
			case 1:{
				System.out.println("Enter id:");
				int id=s.nextInt();
				System.out.println("Enter Name:");
				String name=s.next();
				System.out.println("Enter Mob_No:");
				Long Mob_No=s.nextLong();
				System.out.println("Enter Salary:");
				Double sal=s.nextDouble();
				Employee emp=new Employee(id,name,Mob_No,sal);
				Employee obj=c.save(emp);
				System.out.println("Data added successfully");
				break;
			}
			case 2:{
				System.out.println("Enter id:");
				int id=s.nextInt();
				Employee e=c.update(id);
				break;
			}
			case 3:{
				System.out.println("Enter id:");
				int id=s.nextInt();
				Employee e=c.GetDataById(id);
				break;
			}
			case 4:{
				c.DisplayAllData();
				break;
			}
			case 5:{
				System.out.println("ThankYou");
				System.exit(0);
			}
			default:{
				System.out.println("Invalid Choice");
			}
			}
		}
	}
}
