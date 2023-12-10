package com.hexaware.hibernateassignment;

import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.hexaware.hibernateassignment.entity.Policy;
import com.hexaware.hibernateassignment.services.IPolicyServicesImp;

@Component
public class App
{
	public static void main(String[] args) 
	{
		
		IPolicyServicesImp ip = new IPolicyServicesImp();
		boolean flag = true;
		while (flag) {

			System.out.println("Welcome to Policy No.1");
			System.out.println("1. REGISTER NEW POLICY");
			System.out.println("2. UPDATE EXISTING POLICY DETAILS");
			System.out.println("3. DELETE ANY POLICY");
			System.out.println("4. GET TO KNOW POLICY");
			System.out.println("5. SHOW ALL THE POLICY ");
			System.out.println("0. EXIT");
			
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				
				System.out.println("Enter Policy name");
				scanner.nextLine(); // to handle enter key
				String name1 = scanner.nextLine();
				System.out.println("Enter Premium");
				int premium1 = scanner.nextInt();
				System.out.println("Enter Company");
				scanner.nextLine(); // to handle enter key
				String company1 = scanner.nextLine();
				System.out.println("Enter Policy type");
				String type1 = scanner.nextLine();

				Policy p1 = new Policy();
				p1.setPname(name1);
				p1.setPremium(premium1);
				p1.setCompany(company1);
				p1.setType(type1);
				System.out.println(p1);
			    ip.createPolicy(p1);
			    
			    System.out.println("Policy Registered Successfully");
				break;

			case 2:
				System.out.println("Enter Policy Id");
				int id2 = scanner.nextInt();
				System.out.println("Enter Policy name");
				scanner.nextLine(); // to handle enter key
				String name2 = scanner.nextLine();
				System.out.println("Enter Premium");
				int premium2 = scanner.nextInt();
				System.out.println("Enter Company");
				scanner.nextLine(); // to handle enter key
				String company2 = scanner.nextLine();
				System.out.println("Enter Policy type");
				String type2 = scanner.nextLine();

				Policy p2 = new Policy();
				p2.setPid(id2);
				p2.setPname(name2);
				p2.setPremium(premium2);
				p2.setCompany(company2);
				p2.setType(type2);
			    ip.updatePolicy(p2);
			    System.out.println("Policy Updated Successfully");

				break;
				
			case 3:

				System.out.println("Enter Policy Id");
				Policy p3 = new Policy();
				p3.setPid(scanner.nextInt());
				ip.deletePolicy(p3);
				System.out.println("Policy Deleted Successfully");

				break;
				
			case 4:
				System.out.println("Enter Policy Id");
				int id4 = scanner.nextInt();
				Policy p4 = ip.getPolicyById(id4);
				System.out.println(p4);
				break;

			case 5:
				List<Policy> list = ip.getAllPolicy();
				for (Policy p5 : list) 
				{
					System.out.println(p5);

				}
				break;
				
			case 0:
				flag = false;
				break;
				
				
			default:
				System.err.println("Invalid Input");
				break;
			}
			
		}

	}
}
