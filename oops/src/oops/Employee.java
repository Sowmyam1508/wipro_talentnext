package oops;

//public class Employee {
	class Employee extends Person{
		private double annualSalary;
		private int joinYear;
		private String nationalInsuranceNumber;
		
		public Employee() {
			super();
			
		}
		public Employee(String name,double annualSalary,int joinYear,String nationalInsuranceNumber) {
			super(name);
			this.annualSalary = annualSalary;
			this.joinYear = joinYear;
			this.nationalInsuranceNumber = nationalInsuranceNumber;
		}
		public double getAnnualSalary() {
			return annualSalary;
		}
		public void setAnnualSalary(double annualSalary) {
			this.annualSalary = annualSalary;
		}
		public int getJoinYear() {
			return  joinYear;
		}
		public void setJoinYear(int joinYear) {
			this.joinYear= joinYear;
		}
		public String getNationalInsuranceNumber() {
			return nationalInsuranceNumber;
		}
		public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
			this.nationalInsuranceNumber =  nationalInsuranceNumber;
		}
		
}
