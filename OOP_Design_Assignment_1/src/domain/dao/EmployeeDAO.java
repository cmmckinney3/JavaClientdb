package domain.dao;


import domain.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chron
 */
public class EmployeeDAO {
    public void saveEmployee(Employee employee){
//        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
//        connectionManager.connect();
//        connectionManager.getConnectionObject().prepareStatement("insert into employee tbl");
//        connectionManager.disconnect();
        System.out.println("saved employee to the database: "+employee);
        
    }
    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee to the database: "+employee);
    }
}
