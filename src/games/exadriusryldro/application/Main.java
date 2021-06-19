package games.exadriusryldro.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import games.exadriusryldro.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		List<Employee> employeeList = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered? ");
		int employeesNumber = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1; i <= employeesNumber; i++) {
			
			System.out.printf("Emplyoee #%d:%n", i);
			
			System.out.print("Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("Name: ");
			String name = scanner.nextLine();
			
			System.out.print("Salary: ");
			double salary = scanner.nextDouble();
			
			System.out.println("");
			
			Employee employee = new Employee(id, name, salary);
			
			employeeList.add(employee);
		}
		
		System.out.println("");
		
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter the percentage: ");
		double percentage = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("");
		
		System.out.println("List of employees");
		
		for (int i = 0; i < employeeList.size(); i++) {
			
			if(employeeList.get(i).getId() == id) {				
				employeeList.get(i).addSalary(percentage);
			}
			
			System.out.println(employeeList.get(i).toString());
		}
	
		scanner.close();
	}
}
