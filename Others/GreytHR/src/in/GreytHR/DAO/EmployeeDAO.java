package in.GreytHR.DAO;

import java.util.ArrayList;

import in.GreytHR.DTO.Employee;

public interface EmployeeDAO {
	
	public boolean insertEmployee(Employee e);
	public boolean updateEmployee(Employee e);
	public boolean deleteEmployee(Employee e);
	public Employee getEmployee(String mail, String pass);
	public ArrayList<Employee> getEmployee();

}
