package restart;


public class Employee {
	
		int age;
		double salary;
		String name;
		String gender;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Employee [age=" + age + ", salary=" + salary + ", name=" + name + ", gender=" + gender + "]";
		}
		public Employee(String name) {
			super();
			this.name = name;
		}
		public Employee() {
			super();
		}
		
		
		
		
}
	
		   