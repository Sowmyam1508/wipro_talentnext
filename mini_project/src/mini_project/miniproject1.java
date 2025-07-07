package mini_project;

public class miniproject1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			if(args.length != 1) {
				System.out.println("Please provide valid id.");
				return;
			}
			int empIdSearch = Integer.parseInt(args[0]); 
			
			int []empId = {1001,1002,1003,1004,1005,1006,1007};
			String []name = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
			String []joinDate = {"01/04/2009","23/08/2012","12/11/2008"," 29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
			char []designCode = {'e','c','k','r','m','e','c'};
			String []department = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
			int []basic = {20000,30000,10000,12000,50000,23000,29000};
			int []hra = {8000,12000,8000,6000,20000,9000,12000};
			int []it = {3000,9000,1000,2000,20000,4400,10000};
			
			String designation ="";
			int da =0;
			boolean foundId = false;
			for(int i =0;i<empId.length;i++) {
				if(empId[i] == empIdSearch) {
					foundId  =true;
					switch(designCode[i]) {
					case 'e':
						designation = "Engineer";
						da = 20000;
						break;
					case 'c':
						designation = "Consultant";
						da = 32000;
						break;
					case 'k':
						designation = "Clerk";
						da = 12000;
						break;
					case 'r':
						designation = "Receptionist";
						da = 15000;
						break;
					case 'm':
						designation = "Manager";
						da = 40000;
						break;
					default:
						designation = "Unknown";
						da = 0;
						break;
					}
					int salary = basic[i] + hra[i] + da - it[i];
					System.out.println("Emp No.\tEmpName\tDepartment\tDesignation\tSalary");
					System.out.println(empId[i] + " \t" +name[i] +" \t"+department[i]+"\t\t"+designation+"\t"+salary);
					
				}
			}
			if(!foundId) {
				System.out.println("There is no employee id : " +empIdSearch);
			}
		}

	}

