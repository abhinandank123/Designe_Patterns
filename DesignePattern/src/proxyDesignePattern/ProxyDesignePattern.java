package proxyDesignePattern;

public class ProxyDesignePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EmployeeDao employeeDao=new EmployeeDaoProxy();
			employeeDao.create("ADMIN", new EmployeeDo());
			System.out.println("Operation Successful");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
