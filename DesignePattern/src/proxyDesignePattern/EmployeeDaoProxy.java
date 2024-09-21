package proxyDesignePattern;

public class EmployeeDaoProxy implements EmployeeDao {
	
	EmployeeDao employeeDaoObj;
	
	EmployeeDaoProxy(){
		employeeDaoObj=new EmployeeDaoImp();
	}

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		// TODO Auto-generated method stub
		if(client.equals("ADMIN")) {
			employeeDaoObj.create(client, obj);
			return;
		}
		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		if(client.equals("ADMIN")) {
			employeeDaoObj.delete(client, employeeId);
		}
		throw new Exception("Access Denied");
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		// TODO Auto-generated method stub
		if (client.equals("ADMIN") || client.equals("User")) {

			return employeeDaoObj.get(client, employeeId);
		}
		throw new Exception("Access Denied");
	}

}
