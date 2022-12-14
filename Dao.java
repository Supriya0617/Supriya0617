 package com.learning.employeeproj.repository;

 import java.util.List;

import com.learning.employeeproj.domain.Employee;

 public interface Dao 

{
  public void createEmployee(Employee emp);
  public void showAllEmployee();
  public void showEmployeeBasedOnId(int id);
  public void updateEmployee(int id,String name);
  public void deleteEmployee(int id);
  
}
