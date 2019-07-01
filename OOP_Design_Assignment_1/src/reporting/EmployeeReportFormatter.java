/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporting;

/**
 *
 * @author chron
 */
import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    
    public EmployeeReportFormatter(Employee employee, FormatType formatType){
        super(employee, formatType);
    }    
    
    public String getFormattedEmployee(){
        return getFormattedValue();
    }
}
