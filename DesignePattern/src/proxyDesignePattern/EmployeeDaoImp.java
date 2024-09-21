package proxyDesignePattern;

public class EmployeeDaoImp implements EmployeeDao  {

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Create New Row In Employee Table");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Delete row with EmployeeID "+employeeId);
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("fetching data form the DB");
		return new EmployeeDo();
	}

	
}
