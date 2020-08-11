package com.gobeyond.question.design.pattern;

class Employee {

	private int employeeId; // required
	private String name; // required
	private String phone; // optional
	private String alternativePhone; // optional
	private String address; // optional

	// Note - only 1 private constructor to ensure all object creation goes through
	// this
	private Employee(EmployeeBuilder employeeBuilder) {
		this.employeeId = employeeBuilder.employeeId;
		this.name = employeeBuilder.name;
		this.phone = employeeBuilder.phone;
		this.alternativePhone = employeeBuilder.alternativePhone;
		this.address = employeeBuilder.address;
	}
	// Note - No setters (provides immutability)

	// You can add getters if needed

	@Override
	public String toString() {
		return "Employee{" + "employeeId=" + employeeId + ", name='" + name + '\'' + ", phone='" + phone + '\''
				+ ", alternativePhone='" + alternativePhone + '\'' + ", address='" + address + '\'' + '}';
	}

	static class EmployeeBuilder {

		private int employeeId;
		private String name;
		private String phone;
		private String alternativePhone;
		private String address;

		public EmployeeBuilder(int employeeId, String name) {
			this.employeeId = employeeId;
			this.name = name;
		}

		public EmployeeBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeBuilder setAlternativePhone(String alternativePhone) {
			this.alternativePhone = alternativePhone;
			return this;
		}

		public EmployeeBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Employee build() {
			Employee employee = new Employee(this);
			return employee;
		}

	}

}

public class BuilderDesign {
	public static void main(String[] args) {

		//Object with all the attributes

		//Object with all the attributes
		Employee employee1 = new Employee.EmployeeBuilder(112, "Ria Gupta")
				.setPhone("9876543210")
				.setAlternativePhone("9988776655")
				.setAddress("413-3rd Avenue, Shantinagar, Bangalore")
				.build();

		System.out.println("Employee 1 ::"+employee1);

		//Object with a combination of required and some optional attributes

		Employee employee2 = new Employee.EmployeeBuilder(111, "Dhananjay Kumar").build();

		System.out.println("Employee 2 ::"+employee2);
	}

}

//Reduction in multiple constructors. Only one constructor that accepts Builder object is required.

//There is no need to pass null for optional parameters to the constructor.

//Object is instantiated fully i.e. in a complete state. We always get an immutable object since we didn’t provide any setter methods and hence state of object once created cannot be changed.

//Lesser error prone as user would know what they are passing in each method call. This also gives design flexibility and more readable of client code.



