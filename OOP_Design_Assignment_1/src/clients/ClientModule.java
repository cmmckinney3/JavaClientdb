package clients;


import domain.dao.EmployeeDAO;
import domain.Employee;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chron
 */
public class ClientModule {
    
    public static void main(String args[]){
        Employee peggy = new Employee(1, "Peggy", "Accounting", true);
        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.XML);
    }
    
    public static void hireNewEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.saveEmployee(employee);
    }
    public static void terminateEmployee(Employee employee){
        EmployeeDAO employeeDao = new EmployeeDAO();
        employeeDao.deleteEmployee(employee);
    }
    
    public static void printEmployeeReport(Employee employee, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(employee, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
