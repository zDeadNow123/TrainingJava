package games.exadriusryldro.entities;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, double salary) {	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	
	public String toString() {
		return String.format("%d, %s, %.2f", id, name, salary);
	}
	
	
	public int getId() {
		return id;
	}
	
	public double addSalary(double percentage) {
		
		return salary += (salary * (percentage / 100)); 
	}

}
