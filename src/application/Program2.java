package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println();
		System.out.println("=== TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		
		for (Department item : list) {
			System.out.println(item);
		}
		
		System.out.println();
		System.out.println("=== TEST 3: Department insert ===");
		Department newdepartment = new Department(null, "Food");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! New ID: " + newdepartment.getId());
		
		System.out.println();
		System.out.println("=== TEST 4: Department update ===");
		Department dep2 = departmentDao.findById(7);
		dep2.setName("Computers");
		departmentDao.update(dep2);
		System.out.println("Update Completed! ID =" + dep2.getId());
		
	}

}
