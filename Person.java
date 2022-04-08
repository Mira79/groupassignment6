	

class Person {
	 
	 public String name;
	 public int age;
	 public int contactNumber;
	 public String Address;
	 public double Salary;
	 
	// String person1;
	// String person2;
	 
	
	
		public double displaySalary(){
			return Salary;
		}

class Manager extends Person{	
		private String Specialization;

		public String getSpecialization() {
			return Specialization;
		}

		public void setSpecialization(String specialization) {
			Specialization = specialization;
		}
		
		public void displayManagerSalary() {
			System.out.println("Manager Name is:   " + name + "/n " + 
							   "Age:   "+ age  + "/n" +
							   "Contact Number:   "+ contactNumber  + "/n" +
							   "Address:   "+ Address  + "/n" +
							   "Salary:   "+ Salary  + "/n"+
							   "Specialization:   "+ Specialization  + "/n");
	
}
	}
class Main{
	
	public void main(String[] args) {
		Manager manager1 = new Manager();
		manager1.displayManagerSalary();
		Employee employee1= new Employee();
		employee1.displayEmployeeSalary();
	
	}
}
class Employee extends Person{
private String department;

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public void displayEmployeeSalary() {
	System.out.println("Employee Name is:   " + name + "/n " + 
					   "Age:   "+ age  + "/n" +
					   "Contact Number:   "+ contactNumber  + "/n" +
					   "Address:   "+ Address  + "/n" +
					   "Salary:   "+ Salary  + "/n"+
					   "Department:   "+ department  + "/n");
		}
	}
}