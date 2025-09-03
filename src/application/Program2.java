package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department insert ===");
        Department newDp = new Department(null, "Test");
        departmentDao.insert(newDp);
        System.out.println("Inserted! New id = " + newDp.getId());

        System.out.println("=== TEST 2: department delete ===");
        System.out.println("Enter id for delete test");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("=== TEST 3: department findById ===");
        Department department = departmentDao.findById(4);
        System.out.println(department);

        System.out.println("=== TEST 4: department update ===");
        department = departmentDao.findById(3);
        department.setName("Model");
        departmentDao.update(department);
        System.out.println("Update completed");

        System.out.println("=== TEST 5: department findByAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list){
            System.out.println(obj);
        }
    }
}
